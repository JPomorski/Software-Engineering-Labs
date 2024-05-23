public class Main {
    public static void main(String[] args) {
        MtbFactory mtbFactory = new MtbFactory();
        CityFactory cityFactory = new CityFactory();

        Factories.Frame mtbFrame = mtbFactory.assembleFrame();
        Factories.Wheels mtbWheels = mtbFactory.assembleWheels();
        Factories.Handlebars mtbBars = mtbFactory.assembleHandlebars();

        Factories.Frame cityFrame = cityFactory.assembleFrame();
        Factories.Wheels cityWheels = cityFactory.assembleWheels();
        Factories.Handlebars cityBars = cityFactory.assembleHandlebars();

        mtbFrame.showName();
        mtbWheels.showName();
        mtbBars.showName();

        cityFrame.showName();
        cityWheels.showName();
        cityBars.showName();
    }
}