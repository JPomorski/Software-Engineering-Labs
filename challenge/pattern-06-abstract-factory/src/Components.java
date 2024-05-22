public class Components {
    public static class MtbFrame implements Factories.Frame {
        @Override
        public void showName() {
            System.out.println("Assembled a mountain bike frame");
        }
    }

    public static class CityFrame implements Factories.Frame {
        @Override
        public void showName() {
            System.out.println("Assembled a city bike frame");
        }
    }


    public static class MtbWheels implements Factories.Wheels {
        @Override
        public void showName() {
            System.out.println("Assembled mountain bike wheels");
        }
    }

    public static class CityWheels implements Factories.Wheels {
        @Override
        public void showName() {
            System.out.println("Assembled city bike wheels");
        }
    }


    public static class MtbHandlebars implements Factories.Handlebars {
        @Override
        public void showName() {
            System.out.println("Assembled mountain bike handlebars");
        }
    }

    public static class CityHandlebars implements Factories.Handlebars {
        @Override
        public void showName() {
            System.out.println("Assembled city bike handlebars");
        }
    }
}
