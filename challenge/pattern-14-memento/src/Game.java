public class Game {
    private GameState gameState = new GameState();

    public void updateState(int currentLevel, double playerX, double playerY, double playerZ) {
        gameState.updateState(currentLevel, playerX, playerY, playerZ);
    }

    public SaveFile saveGame() {
        System.out.println("Game Saved");
        return new SaveFile(new GameState(gameState));
    }

    public void loadSavedGame(SaveFile saveFile) {
        System.out.println("Save Loaded");
        gameState = saveFile.getSavedState();
    }

    public void showState() {
        gameState.showState();
    }
}
