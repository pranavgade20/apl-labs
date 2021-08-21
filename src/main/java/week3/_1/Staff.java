package week3._1;

public class Staff extends Student {
    String staff_name, work;

    @Override
    void getData() {
        super.getData();
        System.out.print("Enter staff name: ");
        staff_name = sc.nextLine();
        System.out.println(staff_name);
        System.out.print("Enter work: ");
        work = sc.nextLine();
        System.out.println(work);
    }

    @Override
    void printData() {
        super.printData();
        System.out.println("Staff name is: " + staff_name);
        System.out.println("Work is: " + work);
    }
}
