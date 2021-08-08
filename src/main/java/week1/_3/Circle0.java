package week1._3;

public class Circle0 {
    double radius, area;

    public Circle0(double radius) {
        this.radius = radius;
        double area = radius*radius*Math.PI;
        System.out.printf("Area of circle of radius %f is: %f\n", radius, area);
    }

    public Circle0() {
        this(1);
    }
}
