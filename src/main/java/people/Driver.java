package people;

public class Driver implements Speakable {
    private int driving_experience;
    private int car_accident;


    public Driver(int driving_experience, int car_accident) {
        this.driving_experience = driving_experience;
        this.car_accident = car_accident;
        speak();
        printDrivingExperience();
        printCar_Accident();
    }

    private void printDrivingExperience() {
        if (this.driving_experience < 1) {
            System.out.println("I have less than a year driving experience.");
        } else {System.out.println(String.format("I have %d years of driving experience.",
                this.driving_experience));}
    }

    private void printCar_Accident() {
        if (this.car_accident < 1) {
            System.out.println("I have not had any accidents.");
        } else { if (1 == this.car_accident &&  this.car_accident < 2) {
            System.out.println("I had 1 accident.");
        } else {System.out.println(String.format("I had %d accidents.", this.car_accident));}}
    }

}
