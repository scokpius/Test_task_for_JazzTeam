package utility;

public enum CoefficientEnginePower {

    HORSEPOWER_50(0.6),
    HORSEPOWER_51_100(1.0),
    HORSEPOWER_101_150(1.4),
    HORSEPOWER_151(1.6);

    double coefficient;
    CoefficientEnginePower(double d) {
        coefficient = d;
    }

}
