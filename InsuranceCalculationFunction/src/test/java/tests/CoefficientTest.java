package tests;


import org.junit.Assert;
import org.junit.Test;
import utility.Coefficient;


public class CoefficientTest {


    @Test
    public void checkCoefficientDrivingExperienceAtTheBoundaryValuesMin() {
        Assert.assertEquals("Driving experience up to a year coefficient is not equal to 300.",
                300, Coefficient.calculatingCoefficientDrivingExperience(0));
    }

    @Test
    public void checkCoefficientDrivingExperienceAtTheBoundaryValues() {
        Assert.assertEquals("Driving experience from one to five years, the coefficient is not equal to 200.",
                200, Coefficient.calculatingCoefficientDrivingExperience(1));
        Assert.assertEquals("Driving experience from one to five years, the coefficient is not equal to 200.",
                200, Coefficient.calculatingCoefficientDrivingExperience(4));
    }

    @Test
    public void checkCoefficientDrivingExperienceAtTheBoundaryValuesMax() {
        Assert.assertEquals("Driving experience more than five years, the coefficient is not equal to 100.",
                100, Coefficient.calculatingCoefficientDrivingExperience(5));
    }

    @Test
    public void checkCoefficientSelectionNumberOfAccidentMin() {
        Assert.assertEquals("There were no accidents, the coefficient is not equal to 0,9.",
                0.9, Coefficient.calculatingCoefficientCarAccident(0), 0.0);
    }
    @Test
    public void checkCoefficientSelectionNumberOfAccidentsSecond() {
        Assert.assertEquals("There was one accident, the coefficient is not equal to 1,5.",
                1.5, Coefficient.calculatingCoefficientCarAccident(1), 0.0);
    }
    @Test
    public void checkCoefficientSelectionNumberOfAccidentsThird() {
        Assert.assertEquals("There were two accidents, the coefficient is not 2,5.",
                2.5, Coefficient.calculatingCoefficientCarAccident(2), 0.0);
    }
    @Test
    public void checkCoefficientSelectionNumberOfAccidentsMax() {
        Assert.assertEquals("More than two accidents have occurred, the coefficient is not equal to 4.",
                4, Coefficient.calculatingCoefficientCarAccident(3), 0.0);
    }
    @Test
    public void checkCoefficientSelectionCoefficientEnginePowerMin() {
        Assert.assertEquals("Horsepower less than or equal to 50, coefficient not equal to 0.6.",
                0.6, Coefficient.calculatingCoefficientEnginePower(50), 0.0);
    }
    @Test
    public void checkCoefficientSelectionCoefficientEnginePowerSecond() {
        Assert.assertEquals("The number of horsepower from 51 to 100, the coefficient is not equal to 1.",
                1, Coefficient.calculatingCoefficientEnginePower(51), 0.0);
        Assert.assertEquals("The number of horsepower from 51 to 100, the coefficient is not equal to 1.",
                1, Coefficient.calculatingCoefficientEnginePower(100), 0.0);
    }
    @Test
    public void checkCoefficientSelectionCoefficientEnginePowerThird() {
        Assert.assertEquals("The number of horsepower from 51 to 100, the coefficient is not equal to 1,4.",
                1.4, Coefficient.calculatingCoefficientEnginePower(101), 0.0);
        Assert.assertEquals("The number of horsepower from 51 to 100, the coefficient is not equal to 1,4.",
                1.4, Coefficient.calculatingCoefficientEnginePower(150), 0.0);
    }
    @Test
    public void checkCoefficientSelectionCoefficientEnginePowerMax() {
        Assert.assertEquals("the number of horsepower is more than 150, the coefficient is not equal to 1,6.",
                1.6, Coefficient.calculatingCoefficientEnginePower(151), 0.0);
    }

}
