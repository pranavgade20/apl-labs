package week4._1.mca;

public class Student {
    int rollNo;
    String name;
    public int marks1, marks2;

    public Student(int rollNo, String name, int marks1, int marks2) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
    }

    public void display() {
        System.out.println("Roll number " + rollNo + " student " + name + " has marks " + marks1 +
                " and " + marks2);
    }
}
