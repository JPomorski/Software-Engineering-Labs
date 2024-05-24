public class Sphere implements Mesh {
    @Override
    public void addToScene() {
        System.out.println("Added a sphere");
    }

    @Override
    public void move(double distance) {
        System.out.println("Sphere moved by " + distance);
    }

    @Override
    public void scale(double factor) {
        System.out.println("Sphere scaled by " + factor);
    }
}
