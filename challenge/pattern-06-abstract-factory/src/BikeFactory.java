public class BikeFactory {
    public Frame assembleFrame(Factories.FrameFactory factory) {
        return factory.createFrame();
    }

    public Wheels assembleWheels(Factories.WheelsFactory factory) {
        return factory.createWheels();
    }

    public Handlebars assembleHandlebars(Factories.HandlebarsFactory factory) {
        return factory.createHandlebars();
    }
}
