package week3._1;


import week3._1.Teacher.*;
/*
1. Create a student class that contains three variables (name, roll number and phone
number) and two methods for taking the inputs and display the results of those filed.
Next class teacher and staff inherit the student class. The teach class contains another
two variables (name and area of teaching) and two methods for taking the inputs and
display the results of those filed. The staff class contains another two variables (name
and work) and two methods for taking the inputs and display the results of those filed.
Further, teacher class contains three further classes, namely science, arts and commerce
and each of the class contain a variable number of student and further contains two
methods for taking the inputs and display the results of this filed.
 */
public class Main {
    public static void main(String[] args) {
        int choice = 10;
        do {
            System.out.print("""
                    1. Create new Teacher
                    2. Create new Staff
                    3. Create new Student
                    4. Add new student to Arts
                    5. Print Arts students
                    6. Add new student to Commerce
                    7. Print Commerce students
                    8. Add new student to Science
                    9. Print Science students
                    10. Exit
                    Enter choice:\040""");
            choice = Student.sc.nextInt();
            Student.sc.nextLine();
            System.out.println(choice);
            switch (choice) {
                case 1 -> {
                    Teacher teacher = new Teacher();
                    System.out.println("Creating teacher...");
                    teacher.getData();
                    System.out.println("Teacher details are:");
                    teacher.printData();
                }
                case 2 -> {
                    Staff staff = new Staff();
                    System.out.println("Creating staff...");
                    staff.getData();
                    System.out.println("Staff details are:");
                    staff.printData();
                }
                case 3 -> {
                    Student student = new Student();
                    System.out.println("Creating student...");
                    student.getData();
                    System.out.println("Student details are:");
                    student.printData();
                }
                case 4 -> Arts.addStudent();
                case 5 -> Arts.printStudents();
                case 6 -> Commerce.addStudent();
                case 7 -> Commerce.printStudents();
                case 8 -> Science.addStudent();
                case 9 -> Science.printStudents();
            }
        } while (choice < 10);
    }
}
