package utility;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Coefficient {
    private static final Logger LOGGER = LogManager.getLogger(Coefficient.class);

    public static int calculatingCoefficientDrivingExperience(int driving_experience){
        LOGGER.debug("Selection of the coefficient depending on the driving experience");
        if (driving_experience < 1){
            return CoefficientDrivingExperience.UP_TO_1_YEAR.coefficient;
        } else {
            if (1 <= driving_experience &&  driving_experience < 5) {
                return CoefficientDrivingExperience.UP_TO_5_YEAR.coefficient;
            } else {
                return CoefficientDrivingExperience.MORE_THAT_5_YEARS.coefficient;
            }

        }
    }
    public static  double calculatingCoefficientCarAccident(int car_accident){
        LOGGER.debug("Selection of coefficient depending on the number of accidents");
        switch (car_accident) {
            case 0:{
                return CoefficientCarAccident.NO_ACCIDENT.coefficient;
            }
            case 1:{
                return CoefficientCarAccident.THERE_IS_1_ACCIDENT.coefficient;
            }
            case 2:{
                return CoefficientCarAccident.THERE_ARE_2_ACCIDENTS.coefficient;
            }
            default: {
                return CoefficientCarAccident.MORE_THAT_2_ACCIDENTS.coefficient;
            }
        }

    }

    public static  double calculatingCoefficientEnginePower(int engine_power){
        LOGGER.debug("Selection of the coefficient depending on the engine power");
        if (engine_power <= 50) {
            return CoefficientEnginePower.HORSEPOWER_50.coefficient;
        } else {
            if( 50 < engine_power && engine_power <= 100 ){
                return CoefficientEnginePower.HORSEPOWER_51_100.coefficient;
            } else {
                if (100 < engine_power && engine_power <= 150){
                    return CoefficientEnginePower.HORSEPOWER_101_150.coefficient;
                } else {
                    return CoefficientEnginePower.HORSEPOWER_151.coefficient;
                }
            }
        }
    }
}
