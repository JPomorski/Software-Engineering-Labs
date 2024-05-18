public class CoffeeMachine {
    private WaterTank waterTank;
    private CoffeePress coffeePress;
    private CoffeeBlender blender;
    private Nozzle nozzle;

    public CoffeeMachine(WaterTank waterTank, CoffeePress coffeePress, CoffeeBlender blender, Nozzle nozzle) {
        this.waterTank = waterTank;
        this.coffeePress = coffeePress;
        this.blender = blender;
        this.nozzle = nozzle;
    }

    public void makeCoffee() {
        waterTank.addWater();
        blender.blend();
        coffeePress.press();
        nozzle.pourCoffee();

        System.out.println("Your coffee is finished. Enjoy!");
    }
}
