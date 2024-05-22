public class Factories {
    public interface FrameFactory {
        Frame createFrame();
    }

    public interface HandlebarsFactory {
        Handlebars createHandlebars();
    }

    public interface WheelsFactory {
        Wheels createWheels();
    }
}
