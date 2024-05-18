import java.util.ArrayList;
import java.util.List;

public class PlayerObservers {
    private List<Observer> observerList = new ArrayList<>();

    public void addObserver(Observer observer) {
        this.observerList.add(observer);
    }

    public void updateObservers() {
        for (Observer observer : observerList) {
            observer.update();
        }
    }
}
