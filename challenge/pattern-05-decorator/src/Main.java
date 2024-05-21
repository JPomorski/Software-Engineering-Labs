public class Main {
    public static void main(String[] args) {
        BasicCoffee coffee = new BasicCoffee();
        coffee.makeCoffee();

        ExtraMilk extra = new ExtraMilk(coffee);
        extra.makeCoffee();
    }
}