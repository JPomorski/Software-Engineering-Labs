import java.util.ArrayList;
import java.util.List;

public class AITraffic {
    private final List<Car> cars = new ArrayList<>();
    private final ModelCache cache;

    public AITraffic(ModelCache cache) {
        this.cache = cache;
    }

    public void addCar(double x, double y, String color, String type) {
        cars.add(new Car(x, y, cache.getModel(color, type)));
    }

    public void startMoving() {
        for(Car car : cars) {
            car.move();
        }
    }
}
