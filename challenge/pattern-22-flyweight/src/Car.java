public class Car {
    private final double x;
    private final double y;
    private final CarModel model;

    public Car(double x, double y, CarModel model) {
        this.x = x;
        this.y = y;
        this.model = model;
    }

    public void move() {
        System.out.println(model.color() + " " + model.type() + " moving from " + x + ", " + y);
    }
}
