package week1._3;

public class Rectangle0 {
    int height, width, area;

    public Rectangle0(int height, int width) {
        this.height = height;
        this.width = width;
        area = height*width;

        System.out.printf("Area of rectangle of width %d, and height %d is: %d\n", width, height, area);
    }

    public Rectangle0() {
        this(1, 1);
    }

    public Rectangle0(int size) {
        this(size, size);
    }

}
