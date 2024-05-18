import java.util.List;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();

        Enemy wolf = new Enemy("Wolf");
        Enemy bandit = new Enemy("Bandit");

        PlayerObservers observers = new PlayerObservers();
        observers.addObservers(List.of(wolf, bandit));

        player.setObservers(observers);
        player.move();
    }
}