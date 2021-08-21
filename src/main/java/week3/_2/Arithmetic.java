package week3._2;

/*
2. Create a java class namely arithmetic which contains four abstract methods namely
addition, subtraction, multiplication and division that perform arithmetic operation by
taking two numbers as inputs. Further, write four non-abstract classes that defines the
functionality of the above-mentioned operations and display the results of those
functions by creating another main class.

 */
public abstract class Arithmetic {
    abstract int addition (int x, int y);
    abstract int subtraction (int x, int y);
    abstract int multiplication (int x, int y);
    abstract double division (int x, int y);
}
