public class Components {
    public static class MtbFrame implements Factory.Frame {
        @Override
        public void showName() {
            System.out.println("Assembled a mountain bike frame");
        }
    }

    public static class CityFrame implements Factory.Frame {
        @Override
        public void showName() {
            System.out.println("Assembled a city bike frame");
        }
    }


    public static class MtbWheels implements Factory.Wheels {
        @Override
        public void showName() {
            System.out.println("Assembled mountain bike wheels");
        }
    }

    public static class CityWheels implements Factory.Wheels {
        @Override
        public void showName() {
            System.out.println("Assembled city bike wheels");
        }
    }


    public static class MtbHandlebars implements Factory.Handlebars {
        @Override
        public void showName() {
            System.out.println("Assembled mountain bike handlebars");
        }
    }

    public static class CityHandlebars implements Factory.Handlebars {
        @Override
        public void showName() {
            System.out.println("Assembled city bike handlebars");
        }
    }
}
