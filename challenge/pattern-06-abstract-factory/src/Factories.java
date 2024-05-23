public class Factories {
    public interface BikeFactory {
        Frame assembleFrame();

        Wheels assembleWheels();

        Handlebars assembleHandlebars();
    }

    public interface FrameFactory {
        Frame createFrame();
    }

    public interface HandlebarsFactory {
        Handlebars createHandlebars();
    }

    public interface WheelsFactory {
        Wheels createWheels();
    }

    public interface Frame {
        void showName();
    }

    public interface Handlebars {
        void showName();
    }

    public interface Wheels {
        void showName();
    }
}
