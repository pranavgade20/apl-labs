package week3._5;

/*
5. Write a specific scenario and then write a java program on that scenario like Question 1
and 2 that contains both method overloading and method overriding in the same
program.
 */
public class Main {
    public static void main(String[] args) {
        var car = new Car();
        car.honk(); // overriding
        car.honk("BEEP BOOP"); // overloading
    }
}
