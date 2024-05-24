public class Factory {
    public interface BikeFactory {
        Frame assembleFrame();
        Wheels assembleWheels();
        Handlebars assembleHandlebars();
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
