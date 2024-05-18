public class Main {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine(
                new WaterTank(),
                new CoffeePress(),
                new CoffeeBlender(),
                new Nozzle()
        );
        coffeeMachine.makeCoffee();
    }
}