package utility;

public enum CoefficientDrivingExperience {
    UP_TO_1_YEAR(300),
    UP_TO_5_YEAR(200),
    MORE_THAT_5_YEARS(100);

    int coefficient;
    CoefficientDrivingExperience(int i) {
        coefficient = i;
    }
  }
