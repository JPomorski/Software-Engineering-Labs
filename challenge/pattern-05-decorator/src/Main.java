public class Main {
    public static void main(String[] args) {
        BasicCake cake = new BasicCake();
        cake.makeCake();

        AddVanillaFrosting extraFrosting = new AddVanillaFrosting(cake);
        extraFrosting.makeCake();
    }
}