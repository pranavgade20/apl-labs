package week3._1;

import java.util.ArrayList;
import java.util.Scanner;

public class Teacher extends Student {
    private String teacher_name, area_of_teaching;

    @Override
    void getData() {
        super.getData();
        System.out.print("Enter teacher name: ");
        teacher_name = sc.nextLine();
        System.out.println(teacher_name);
        System.out.print("Enter area of teaching: ");
        area_of_teaching = sc.nextLine();
        System.out.println(area_of_teaching);
    }

    @Override
    void printData() {
        super.printData();
        System.out.println("Teacher name is: " + teacher_name);
        System.out.println("Area of teaching is: " + area_of_teaching);
    }

    static class Science {
        static ArrayList<Student> students = new ArrayList<>();

        static void addStudent() {
            Student student = new Student();
            student.getData();
            students.add(student);
        }

        static void printStudents() {
            System.out.println("These are the students in Science: ");
            for (Student student: students) {
                student.printData();
            }
            System.out.println();
        }
    }
    static class Arts {
        static ArrayList<Student> students = new ArrayList<>();

        static void addStudent() {
            Student student = new Student();
            student.getData();
            students.add(student);
        }

        static void printStudents() {
            System.out.println("These are the students in Arts: ");
            for (Student student: students) {
                student.printData();
            }
            System.out.println();
        }
    }
    static class Commerce {
        static ArrayList<Student> students = new ArrayList<>();

        static void addStudent() {
            Student student = new Student();
            student.getData();
            students.add(student);
        }

        static void printStudents() {
            System.out.println("These are the students in Commerce: ");
            for (Student student: students) {
                student.printData();
            }
            System.out.println();
        }
    }
}
