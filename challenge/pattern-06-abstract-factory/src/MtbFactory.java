public class MtbFactory implements Factory.BikeFactory {
    @Override
    public Factory.Frame assembleFrame() {
        return new Components.MtbFrame();
    }

    @Override
    public Factory.Wheels assembleWheels() {
        return new Components.MtbWheels();
    }

    @Override
    public Factory.Handlebars assembleHandlebars() {
        return new Components.MtbHandlebars();
    }
}
