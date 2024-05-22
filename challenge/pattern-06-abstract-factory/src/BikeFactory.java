public class BikeFactory {
    public Factories.Frame assembleFrame(Factories.FrameFactory factory) {
        return factory.createFrame();
    }

    public Factories.Wheels assembleWheels(Factories.WheelsFactory factory) {
        return factory.createWheels();
    }

    public Factories.Handlebars assembleHandlebars(Factories.HandlebarsFactory factory) {
        return factory.createHandlebars();
    }
}
