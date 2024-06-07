import java.util.ArrayList;
import java.util.List;

public class ModelCache {
    private final List<CarModel> models = new ArrayList<>();

    public CarModel getModel(String color, String type) {
        for(CarModel model : models) {
            if(model.color().equals(color) && model.type().equals(type)) {
                return model;
            }
        }

        CarModel newModel = new CarModel(color, type);
        models.add(newModel);
        return newModel;
    }
}
