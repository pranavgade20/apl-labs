package week1._3;

import week1._1.Main;

public class Circle1 {
    static double calcArea(double radius) {
        double area = radius*radius*Math.PI;
        System.out.printf("Area of circle of radius %f is: %f\n", radius, area);
        return area;
    }
    static double calcArea() {
        return calcArea(1);
    }
}
