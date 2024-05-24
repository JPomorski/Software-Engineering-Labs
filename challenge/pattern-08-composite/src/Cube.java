public class Cube implements Mesh {
    @Override
    public void addToScene() {
        System.out.println("Added a cube");
    }

    @Override
    public void move(double distance) {
        System.out.println("Cube moved by " + distance);
    }

    @Override
    public void scale(double factor) {
        System.out.println("Cube scaled by " + factor);
    }
}
