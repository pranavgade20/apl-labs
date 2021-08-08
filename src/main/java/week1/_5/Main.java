package week1._5;

public class Main {
    public static void main(String[] args) {
        int a = 3, b = 6, c = 5, d = 1;
        System.out.printf("Min of %d, %d, %d, %d using ternary operators: %d", a, b, c, d, min0(a, b, c, d));
        System.out.printf("Max of %d, %d, %d, %d using ternary operators: %d", a, b, c, d, max0(a, b, c, d));
        System.out.printf("Min of %d, %d, %d, %d using if-else statements: %d", a, b, c, d, min1(a, b, c, d));
        System.out.printf("Max of %d, %d, %d, %d using if-else statements: %d", a, b, c, d, max1(a, b, c, d));
    }

    static int min0 (int a, int b, int c, int d) {
        int min = a;
        min = min < b ? min : b;
        min = min < c ? min : c;
        min = min < d ? min : d;
        return min;
    }
    static int max0 (int a, int b, int c, int d) {
        int max = a;
        max = max > b ? max : b;
        max = max > c ? max : c;
        max = max > d ? max : d;
        return max;
    }
    static int min1(int a, int b, int c, int d) {
        if (a <= b && a <= c && a <= d) {
            return a;
        } else {
            if (b <= a && b <= c && b <= d) {
                return b;
            } else {
                if (c <= a && c <= b && c <= d) {
                    return c;
                } else {
                    return d;
                }
            }
        }
    }
    static int max1(int a, int b, int c, int d) {
        if (a >= b && a >= c && a >= d) {
            return a;
        } else {
            if (b >= a && b >= c && b >= d) {
                return b;
            } else {
                if (c >= a && c >= b && c >= d) {
                    return c;
                } else {
                    return d;
                }
            }
        }
    }
}
