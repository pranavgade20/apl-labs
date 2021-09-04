package week5._1;

import week5._1.citizen.Citizen;

public class Vaccine extends Citizen {
    public Vaccine(String name, String aadhar, String phone, int age) {
        super(name, aadhar, phone, age);
    }

    @Override
    public boolean verifyAge() throws Exception {
        if (age >= 18) return true;
        throw new Exception("Person is not eligible for vaccination");
    }
}
