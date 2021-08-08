package week1._3;

public class Box0 {
    int height, width, depth, volume;

    public Box0(int height, int width, int depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
        volume = height*width*depth;

        System.out.printf("Volume of box of width %d, height %d, and depth %d is: %d\n", width, height, depth, volume);
    }

    public Box0() {
        this(1, 1, 1);
    }

    public Box0(int size) {
        this(size, size, size);
    }
}
