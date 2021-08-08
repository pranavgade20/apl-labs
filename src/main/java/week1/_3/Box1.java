package week1._3;

public class Box1 {
    public static int calculateVolume(int height, int width, int depth) {
        int volume = height*width*depth;
        System.out.printf("Volume of box of width %d, height %d, and depth %d is: %d\n", width, height, depth, volume);

        return volume;
    }
    public static int calculateVolume(int size) {
        return calculateVolume(size, size, size);
    }
    public static int calculateVolume() {
        return calculateVolume(1, 1, 1);
    }
}
