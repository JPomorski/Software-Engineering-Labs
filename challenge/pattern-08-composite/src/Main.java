public class Main {
    public static void main(String[] args) {
        Cube cube1 = new Cube();
        Cube cube2 = new Cube();
        Sphere sphere1 = new Sphere();

        MeshCollection collection = new MeshCollection();
        collection.addMesh(cube1);
        collection.addMesh(cube2);
        collection.addMesh(sphere1);

        collection.addToScene();
        collection.move(15);
        collection.scale(.75);
    }
}