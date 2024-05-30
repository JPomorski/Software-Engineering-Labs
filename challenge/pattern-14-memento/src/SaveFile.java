public class SaveFile {
    private final GameState savedState;

    public SaveFile(GameState gameState) {
        this.savedState = gameState;
    }

    public GameState getSavedState() {
        return savedState;
    }
}
