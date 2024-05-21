public class Main {
    public static void main(String[] args) {
        BasicCoffee coffee = new BasicCoffee();
        coffee.makeCoffee();

        MilkDispenser dispenser = new MilkDispenser(coffee);
        dispenser.makeCoffee();
    }
}