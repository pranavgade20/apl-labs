package week2._3;

public class Main {
    // Write a simple program with a class “Mobile” and declare the variable cost and camera
    // as private and username as public. Next print the values of three different users Mobile
    // type based on three member variables.
    public static void main(String[] args) {
        var m1 = new Mobile(30000, "Samsung", "Pranav");
        var m2 = new Mobile(60000, "Samsung", "Eshan");
        var m3 = new Mobile(95000, "Apple", "Arsh");

        m1.print();
        System.out.println("Changing username...");
        m1.username = "Pranav Gade";
        m1.print();
        m2.print();
        m3.print();
    }
}
