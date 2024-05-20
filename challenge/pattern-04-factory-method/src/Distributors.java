public class Distributors {
    public static class FantaDistributor implements Distributor {
        @Override
        public Drink createDrink() {
            return new Drinks.Fanta();
        }
    }

    public static class ColaDistributor implements Distributor {
        @Override
        public Drink createDrink() {
            return new Drinks.Cola();
        }
    }

    public static class SpriteDistributor implements Distributor {
        @Override
        public Drink createDrink() {
            return new Drinks.Sprite();
        }
    }
}
