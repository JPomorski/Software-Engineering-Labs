public class GameState {
    private int currentLevel;
    private double playerX, playerY, playerZ;

    public GameState() {}

    public GameState(GameState other) {
        this.currentLevel = other.currentLevel;
        this.playerX = other.playerX;
        this.playerY = other.playerY;
        this.playerZ = other.playerZ;
    }

    public void updateState(int currentLevel, double playerX, double playerY, double playerZ) {
        this.currentLevel = currentLevel;
        this.playerX = playerX;
        this.playerY = playerY;
        this.playerZ = playerZ;
    }

    public void showState() {
        System.out.println("Current level: " + currentLevel);
        System.out.println("Player position: " + playerX + ", " + playerY + ", " + playerZ);
    }
}
