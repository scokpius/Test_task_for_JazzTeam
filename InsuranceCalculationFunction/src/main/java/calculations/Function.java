package calculations;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import utility.Coefficient;

import cars.*;

public class Function {
    private static final int base_rate = 10;
    private static final double auto_insurance_cost_min = 210;

    private double auto_insurance_cost;

    private static final Logger LOGGER = LogManager.getLogger(Function.class);

    public Function(int driving_experience, int car_accident, int engine_power) {
        new Car(driving_experience, car_accident, engine_power);
        LOGGER.info("Function for calculating the cost of car insurance.");
        auto_insurance_cost = calculatingTheCostOfCarInsurance(driving_experience, car_accident, engine_power);
        System.out.println(String.format("The cost insurance of car is equals %f rubles.",auto_insurance_cost));
        LOGGER.debug("Getting the cost of car insurance");
    }

    public double getAuto_insurance_cost() {
        return auto_insurance_cost;
    }

    private double calculatingTheCostOfCarInsurance(int driving_experience, int car_accident, int engine_power) {
        LOGGER.info("Calculating the cost of car insurance.");
        this.auto_insurance_cost = (this.base_rate +
                Coefficient.calculatingCoefficientDrivingExperience(driving_experience)) *
                Coefficient.calculatingCoefficientCarAccident(car_accident) *
                Coefficient.calculatingCoefficientEnginePower(engine_power);
        if (auto_insurance_cost <= auto_insurance_cost_min){
            auto_insurance_cost = auto_insurance_cost_min;
        }
        return this.auto_insurance_cost;
    }
}
