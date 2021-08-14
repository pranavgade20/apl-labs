package week2._4;

public class UnmannedVehicle {
    double locX, locY; // location in km from some origin

    public UnmannedVehicle(double locX, double locY) {
        this.locX = locX;
        this.locY = locY;
    }

    public int[] getLocationKilometers() {
        return new int[]{(int) Math.rint(locX), (int) Math.rint(locY)};
    }
    public int[] getLocationMeters() {
        return new int[]{(int) Math.rint(locX*1000), (int) Math.rint(locY*1000)};
    }

    void setLocation(double x, double y) {
        locX = x;
        locY = y;
    }
}
