public class BikeFactory {
    public Frame assembleFrame(FrameFactory factory) {
        return factory.createFrame();
    }

    public Wheels assembleWheels(WheelsFactory factory) {
        return factory.createWheels();
    }

    public Handlebars assembleHandlebars(HandlebarsFactory factory) {
        return factory.createHandlebars();
    }
}
