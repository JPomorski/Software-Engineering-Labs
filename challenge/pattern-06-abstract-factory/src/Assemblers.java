@SuppressWarnings("unused")
public class Assemblers {
    public static class MtbFrameAssembler implements FrameFactory {
        @Override
        public Frame createFrame() {
            return new Components.MtbFrame();
        }
    }

    public static class CityFrameAssembler implements FrameFactory {
        @Override
        public Frame createFrame() {
            return new Components.CityFrame();
        }
    }


    public static class MtbWheelsAssembler implements WheelsFactory {
        @Override
        public Wheels createWheels() {
            return new Components.MtbWheels();
        }
    }

    public static class CityWheelsAssembler implements WheelsFactory {
        @Override
        public Wheels createWheels() {
            return new Components.CityWheels();
        }
    }


    public static class MtbHandlebarsAssembler implements HandlebarsFactory {
        @Override
        public Handlebars createHandlebars() {
            return new Components.MtbHandlebars();
        }
    }

    public static class CityHandlebarsAssembler implements HandlebarsFactory {
        @Override
        public Handlebars createHandlebars() {
            return new Components.CityHandlebars();
        }
    }
}
