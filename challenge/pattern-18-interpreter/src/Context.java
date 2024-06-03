import java.util.HashMap;
import java.util.Map;

public class Context {
    private final Map<Integer, String> items = new HashMap<>();

    public void addItem(int id, String name) {
        items.put(id, name);
    }

    public String getItem(int id) {
        return items.get(id);
    }
}
