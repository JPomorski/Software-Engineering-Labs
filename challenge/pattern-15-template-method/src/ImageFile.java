public abstract class ImageFile {
    protected String name;

    public ImageFile(String name) {
        this.name = name;
    }

    public void save() {
        System.out.println("Saved file " + name);
    }

    public void open() {
        System.out.println("Opened file " + name);
    }

    public void close() {
        System.out.println("Closed file " + name);
    }

    public abstract void export(String path);
}
