public class Main {
    public static void main(String[] args) {
        DrinkMachine drinkMachine = new DrinkMachine();

        Distributor fantaDistributor = new Distributors.FantaDistributor();
        Distributor colaDistributor = new Distributors.ColaDistributor();
        Distributor spriteDistributor = new Distributors.SpriteDistributor();

        drinkMachine.pourDrink(fantaDistributor).showName();
        drinkMachine.pourDrink(colaDistributor).showName();
        drinkMachine.pourDrink(spriteDistributor).showName();
    }
}