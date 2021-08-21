package week3._3;

/*
3. Write a specific scenario and then write a java program on that scenario like Question 1
and 2 that represent multiple inheritance can possible to implement using interface.
Similarly, write a specific scenario and then write a java program on that scenario like
Question 1 and 2 that represent interface extends another interface instead of
implements. (Do not use the examples which have been discussed in the lectures).
 */

/**
 * Interfaces:
 * 1. Telephone - allows you to call other telephones
 * 2. Computer - has a cpu and memory and allows you to get memory
 * 3. PortableComputer - is a type of computer, and allows you to get battery
 *
 * Class:
 * Smartphone - implements PortableComputer and Telephone, because we can perform computations on it
 *              as well as call other phones.
 */
public class Main {
    public static void main(String[] args) {
        var smartphone = new Smartphone();

        System.out.println("Changing phone number...");
        smartphone.changeSim("+919876543210");
        smartphone.call("+918888888888");
        System.out.println("Battery level is: " + smartphone.getBattery() + "%");
        System.out.println("Available memory is: " + smartphone.getMemory() + "GiB");
    }
}
