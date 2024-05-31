public class ImageAsPNG extends ImageFile {
    public ImageAsPNG(String name) {
        super(name);
    }

    @Override
    public void export(String path) {
        System.out.println("File exported to " + path + name + ".png");
    }
}
