package week2._4;

import java.util.Arrays;

public class Main {
    // Assume that a program contains one method to set the random location of the unmanned
    // vehicle and two getter methods to retrieve the accurate location value in relevant units.
    // Please justify which java concept is used in the above sample program.
    // Encapsulation is used as location variables can be accessed by defined methods.
    public static void main(String[] args) {
        var vehicle = new UnmannedVehicle(12, 42);
        vehicle.setLocation(12.123, 42.4321);
        System.out.println("Vehicle position in kilometers: " + Arrays.toString(vehicle.getLocationKilometers()));
        System.out.println("Vehicle position in meters: " + Arrays.toString(vehicle.getLocationMeters()));
    }
}
