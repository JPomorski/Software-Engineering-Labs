public class CityFactory implements Factories.BikeFactory {
    @Override
    public Factories.Frame assembleFrame() {
        return new Assemblers.CityFrameAssembler().createFrame();
    }

    @Override
    public Factories.Wheels assembleWheels() {
        return new Assemblers.CityWheelsAssembler().createWheels();
    }

    @Override
    public Factories.Handlebars assembleHandlebars() {
        return new Assemblers.CityHandlebarsAssembler().createHandlebars();
    }
}
