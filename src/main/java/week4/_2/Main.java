package week4._2;

import week4._2.vehicle.Vehicle;

/*
2. Write a program to create a user-defined package in Java called vehicle and include it in your program
called car. Construct your program as if you are using inheritance, but via packages. Let your parent class
be in the vehicle and let your subclass be in the car.
 */
public class Main {
    public static void main(String[] args) {
        var vehicle = new Vehicle();
        System.out.println("Vehicle has " + vehicle.wheels + " wheels.");
        vehicle.honk();

        var car = new Car();
        System.out.println("Car has " + car.wheels + " wheels.");
        car.honk();
    }
}
