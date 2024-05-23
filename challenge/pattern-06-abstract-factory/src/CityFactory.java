public class CityFactory implements Factory.BikeFactory {
    @Override
    public Factory.Frame assembleFrame() {
        return new Components.CityFrame();
    }

    @Override
    public Factory.Wheels assembleWheels() {
        return new Components.CityWheels();
    }

    @Override
    public Factory.Handlebars assembleHandlebars() {
        return new Components.CityHandlebars();
    }
}
