package week3._2;

public class BasicCalculator extends Arithmetic {
    @Override
    int addition(int x, int y) {
        return x + y;
    }

    @Override
    int subtraction(int x, int y) {
        return x - y;
    }

    @Override
    int multiplication(int x, int y) {
        return x * y;
    }

    @Override
    double division(int x, int y) {
        return x / y;
    }
}