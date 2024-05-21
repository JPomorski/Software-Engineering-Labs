public class ExtrasMachine implements CoffeeMachine {
    protected CoffeeMachine coffeeMachine;

    public ExtrasMachine(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void makeCoffee() {
        coffeeMachine.makeCoffee();
    }
}
