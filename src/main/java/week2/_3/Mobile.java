package week2._3;

public class Mobile {
    private int cost;
    private String camera;
    public String username;

    public Mobile(int cost, String camera, String username) {
        this.cost = cost;
        this.camera = camera;
        this.username = username;
    }

    public void print() {
        System.out.println("Mobile cost: " + cost + "; camera: " + camera + "; username: " + username);
    }
}
