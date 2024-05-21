public class ExtraMilk extends ExtrasMachine {
    public ExtraMilk(CoffeeMachine coffeeMachine) {
        super(coffeeMachine);
    }

    @Override
    public void makeCoffee() {
        coffeeMachine.makeCoffee();
        System.out.println("- with extra milk");
    }
}
