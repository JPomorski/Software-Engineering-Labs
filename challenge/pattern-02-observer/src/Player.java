public class Player {
    private PlayerObservers observers;

    public void setObservers(PlayerObservers observers) {
        this.observers = observers;
    }

    public void move() {
        observers.updateObservers();
    }
}
