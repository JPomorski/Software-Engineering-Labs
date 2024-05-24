import java.util.ArrayList;

@SuppressWarnings("unused, FieldMayBeFinal")
public class MeshCollection implements Mesh {
    private ArrayList<Mesh> meshList = new ArrayList<>();

    public void addMesh(Mesh mesh) {
        meshList.add(mesh);
    }

    public void removeMesh(Mesh mesh) {
        meshList.remove(mesh);
    }

    @Override
    public void addToScene() {
        for(Mesh mesh : meshList) {
            mesh.addToScene();
        }
    }

    @Override
    public void move(double distance) {
        for(Mesh mesh : meshList) {
            mesh.move(distance);
        }
    }

    @Override
    public void scale(double factor) {
        for(Mesh mesh : meshList) {
            mesh.scale(factor);
        }
    }
}
