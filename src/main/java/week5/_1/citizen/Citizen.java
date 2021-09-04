package week5._1.citizen;

public abstract class Citizen {
    protected String name, aadhar, phone;
    protected int age;

    public Citizen(String name, String aadhar, String phone, int age) {
        this.name = name;
        this.aadhar = aadhar;
        this.phone = phone;
        this.age = age;
    }

    public abstract boolean verifyAge() throws Exception;
}
