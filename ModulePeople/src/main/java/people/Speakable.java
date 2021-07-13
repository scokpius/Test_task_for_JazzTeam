package people;

public interface Speakable {
    default void speak(){
        System.out.println("This is the driver data Driver: ");
    }
}
