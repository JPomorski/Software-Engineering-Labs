@SuppressWarnings("unused")
public class Assemblers {
    public static class MtbFrameAssembler implements Factories.FrameFactory {
        @Override
        public Frame createFrame() {
            return new Components.MtbFrame();
        }
    }

    public static class CityFrameAssembler implements Factories.FrameFactory {
        @Override
        public Frame createFrame() {
            return new Components.CityFrame();
        }
    }


    public static class MtbWheelsAssembler implements Factories.WheelsFactory {
        @Override
        public Wheels createWheels() {
            return new Components.MtbWheels();
        }
    }

    public static class CityWheelsAssembler implements Factories.WheelsFactory {
        @Override
        public Wheels createWheels() {
            return new Components.CityWheels();
        }
    }


    public static class MtbHandlebarsAssembler implements Factories.HandlebarsFactory {
        @Override
        public Handlebars createHandlebars() {
            return new Components.MtbHandlebars();
        }
    }

    public static class CityHandlebarsAssembler implements Factories.HandlebarsFactory {
        @Override
        public Handlebars createHandlebars() {
            return new Components.CityHandlebars();
        }
    }
}
