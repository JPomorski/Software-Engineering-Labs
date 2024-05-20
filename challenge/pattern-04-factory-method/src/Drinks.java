public class Drinks {
    public static class Fanta implements Drink {
        @Override
        public void showName() {
            System.out.println("Poured Fanta");
        }
    }

    public static class Cola implements Drink {
        @Override
        public void showName() {
            System.out.println("Poured Cola");
        }
    }

    public static class Sprite implements Drink {
        @Override
        public void showName() {
            System.out.println("Poured Sprite");
        }
    }
}
