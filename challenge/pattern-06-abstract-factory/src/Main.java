public class Main {
    public static void main(String[] args) {
        MtbFactory mtbFactory = new MtbFactory();
        CityFactory cityFactory = new CityFactory();

        Factory.Frame mtbFrame = mtbFactory.assembleFrame();
        Factory.Wheels mtbWheels = mtbFactory.assembleWheels();
        Factory.Handlebars mtbBars = mtbFactory.assembleHandlebars();

        Factory.Frame cityFrame = cityFactory.assembleFrame();
        Factory.Wheels cityWheels = cityFactory.assembleWheels();
        Factory.Handlebars cityBars = cityFactory.assembleHandlebars();

        mtbFrame.showName();
        mtbWheels.showName();
        mtbBars.showName();

        cityFrame.showName();
        cityWheels.showName();
        cityBars.showName();
    }
}