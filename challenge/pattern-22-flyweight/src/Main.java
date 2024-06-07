public class Main {
    public static void main(String[] args) {
        AITraffic traffic = new AITraffic(new ModelCache());
        traffic.addCar(15.0, 2.0, "Blue", "Sedan");
        traffic.addCar(20.0, 1.0, "Blue", "Sedan");
        traffic.addCar(24.0, 4.0, "Red", "Truck");
        traffic.addCar(14.0, 20.0, "Yellow", "Hatchback");

        traffic.startMoving();
    }
}