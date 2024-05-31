public class ImageAsJPG extends ImageFile {
    public ImageAsJPG(String name) {
        super(name);
    }

    @Override
    public void export(String path) {
        System.out.println("File exported to " + path + name + ".jpg");
    }
}
