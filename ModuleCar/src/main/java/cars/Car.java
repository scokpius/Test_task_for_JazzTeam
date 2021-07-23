package cars;



import people.Driver;

public class Car {
    private int engine_power;

    public Car(int driving_experience, int car_accident, int engine_power){
        new Driver(driving_experience,car_accident);
        this.engine_power = engine_power;
        System.out.println(String.format("The engine power of my car is %d horsepower.", engine_power));
    }
}
