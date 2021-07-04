package utility;

public enum CoefficientCarAccident {
    NO_ACCIDENT(0.9),
    THERE_IS_1_ACCIDENT(1.5),
    THERE_ARE_2_ACCIDENTS(2.5),
    MORE_THAT_2_ACCIDENTS(4.0);

    double coefficient;
    CoefficientCarAccident(double d) {
        coefficient = d;
    }
}
