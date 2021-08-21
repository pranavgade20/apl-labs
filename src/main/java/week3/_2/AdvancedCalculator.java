package week3._2;

public class AdvancedCalculator extends Arithmetic {
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
        return x / (double)y;
    }

    double pow(double a, double b) {
        return Math.pow(a, b);
    }
}
