public class MilkDispenser extends ExtrasMachine {
    public MilkDispenser(CoffeeMachine coffeeMachine) {
        super(coffeeMachine);
    }

    @Override
    public void makeCoffee() {
        coffeeMachine.makeCoffee();
        System.out.println("- with extra milk");
    }
}
