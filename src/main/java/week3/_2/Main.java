package week3._2;

public class Main {
    public static void main(String[] args) {
        var basicCalculator = new BasicCalculator();
        System.out.println("Arithmetic with basic calculator: ");
        System.out.println("5 + 2 = " + basicCalculator.addition(5, 2));
        System.out.println("5 - 2 = " + basicCalculator.addition(5, 2));
        System.out.println("5 * 2 = " + basicCalculator.multiplication(5, 2));
        System.out.println("5 / 2 = " + basicCalculator.division(5, 2));
        var betterCalculator = new BetterCalculator();
        System.out.println("Arithmetic with better calculator: ");
        System.out.println("5 + 2 = " + betterCalculator.addition(5, 2));
        System.out.println("5 - 2 = " + betterCalculator.addition(5, 2));
        System.out.println("5 * 2 = " + betterCalculator.multiplication(5, 2));
        System.out.println("5 / 2 = " + betterCalculator.division(5, 2));
        var advancedCalculator = new AdvancedCalculator();
        System.out.println("Arithmetic with advanced calculator: ");
        System.out.println("5 * 2 = " + advancedCalculator.multiplication(5, 2));
        System.out.println("5 / 2 = " + advancedCalculator.division(5, 2));
        System.out.println("5 ^ 2 = " + advancedCalculator.pow(5, 2));
        var scientificCalculator = new ScientificCalculator();
        System.out.println("Arithmetic with scientific calculator: ");
        System.out.println("5 * 2 = " + scientificCalculator.multiplication(5, 2));
        System.out.println("5 / 2 = " + scientificCalculator.division(5, 2));
        System.out.println("sin(3.14) = " + scientificCalculator.sin(3.14));
        System.out.println("cos(0) = " + scientificCalculator.cos(0));
    }
}
