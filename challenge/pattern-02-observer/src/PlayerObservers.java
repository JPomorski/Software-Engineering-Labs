import java.util.ArrayList;
import java.util.List;

public class PlayerObservers {
    private List<Observer> observerList = new ArrayList<>();

    public void addObservers(List<Observer> observers) {
        this.observerList.addAll(observers);
    }

    public void updateObservers() {
        for (Observer observer : observerList) {
            observer.update();
        }
    }
}
