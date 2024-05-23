public class MtbFactory implements Factories.BikeFactory {
    @Override
    public Factories.Frame assembleFrame() {
        return new Assemblers.MtbFrameAssembler().createFrame();
    }

    @Override
    public Factories.Wheels assembleWheels() {
        return new Assemblers.MtbWheelsAssembler().createWheels();
    }

    @Override
    public Factories.Handlebars assembleHandlebars() {
        return new Assemblers.MtbHandlebarsAssembler().createHandlebars();
    }
}
