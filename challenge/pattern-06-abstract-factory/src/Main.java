public class Main {
    public static void main(String[] args) {
        BikeFactory bikeFactory = new BikeFactory();

        Factories.Frame frame = bikeFactory.assembleFrame(new Assemblers.MtbFrameAssembler());
        Factories.Wheels wheels = bikeFactory.assembleWheels(new Assemblers.CityWheelsAssembler());
        Factories.Handlebars bars = bikeFactory.assembleHandlebars(new Assemblers.MtbHandlebarsAssembler());

        frame.showName();
        wheels.showName();
        bars.showName();
    }
}