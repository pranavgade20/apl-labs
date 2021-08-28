package week4._2;

import week4._2.vehicle.Vehicle;

public class Car extends Vehicle {
    int wheels = 4;

    @Override
    public void honk() {
        System.out.println("Car says: BEEP BEEP");
    }
}
