package week3._5;

public class Car extends Vehicle {
    @Override
    void honk() {
        System.out.println("Car honks - BOOP BOOP");
    }

    void honk(String sound) {
        System.out.println("Car honks - " + sound);
    }
}
