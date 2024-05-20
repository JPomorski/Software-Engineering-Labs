public class DrinkMachine {
    public Drink pourDrink(Distributor distributor) {
        return distributor.createDrink();
    }
}
