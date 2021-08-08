package week1._3;

public class Rectangle1 {
    public static int calcArea(int width, int height) {
        int area = height*width;
        System.out.printf("Area of rectangle of width %d, and height %d is: %d\n", width, height, area);
        return area;
    }

    public static int calcArea(int size) {
        return calcArea(size, size);
    }

    public static int calcArea() {
        return calcArea(1, 1);
    }
}
