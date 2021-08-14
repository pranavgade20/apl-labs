package week2._2;

class GetterOnlyClass {
    private int value;

    public GetterOnlyClass(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
public class Main_getter {
    // Write a program where you only define getter method in the class to make read-only.
    public static void main(String[] args) {
        var obj = new GetterOnlyClass(12);
        System.out.println("Getting object value: " + obj.getValue());
    }
}
