package week3._2;

public class ScientificCalculator extends Arithmetic {
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

    double sin(double theta) {
        return Math.sin(theta);
    }

    double cos(double theta) {
        return Math.cos(theta);
    }
}
