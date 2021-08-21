package week3._3;

public class Smartphone implements Telephone, PortableComputer{
    String number = "+910000000000";
    double battery_level = 0.42; // from 0 to 1

    @Override
    public void call(String number) {
        System.out.println("Calling " + number + " from " + this.number);
    }

    @Override
    public int getMemory() {
        return memory_size/2; // 50% is reserved for system use
    }

    @Override
    public double getBattery() {
        return battery_level*100; // get level in percent
    }

    public void changeSim(String newNumber) {
        number = newNumber;
    }
}
