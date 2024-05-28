import java.util.LinkedList;
import java.util.Queue;

public class PC {
    private final Queue<Task> tasks = new LinkedList<>();

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void powerOn() {
        while(!tasks.isEmpty()) {
            tasks.poll().execute();
        }
    }
}
