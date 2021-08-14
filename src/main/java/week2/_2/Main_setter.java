package week2._2;

class SetterOnlyClass {
    int value;

    public SetterOnlyClass(int value) {
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

public class Main_setter {
    // Write a program where you only define setter method in the class to make write-only.
    public static void main(String[] args) {
        var obj = new SetterOnlyClass(12);
        System.out.println("Setting value to 42.");
        obj.setValue(42);
        System.out.println("Value set to 42.");
    }
}
