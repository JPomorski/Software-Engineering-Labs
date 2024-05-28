public class TyreTypes {
    public static class SoftTyres implements Tyres {
        @Override
        public void showTyreType() {
            System.out.println("Soft compound tyres installed");
        }
    }

    public static class MediumTyres implements Tyres {
        @Override
        public void showTyreType() {
            System.out.println("Medium compound tyres installed");
        }
    }

    public static class HardTyres implements Tyres {
        @Override
        public void showTyreType() {
            System.out.println("Hard compound tyres installed");
        }
    }
}
