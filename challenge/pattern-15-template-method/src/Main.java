public class Main {
    public static void main(String[] args) {
        ImageFile pngPicture = new ImageAsPNG("minecraft");
        ImageFile jpgPicture = new ImageAsJPG("gaming");

        pngPicture.save();

        jpgPicture.open();
        jpgPicture.save();
        jpgPicture.close();

        pngPicture.export("/Photos/");
        jpgPicture.export("/Photos/");
    }
}