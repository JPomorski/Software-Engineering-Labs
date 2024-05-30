public class Main {
    public static void main(String[] args) {
        Game game = new Game();

        game.updateState(1, 2.6, 4.7, 0.0);
        SaveFile save1 = game.saveGame();

        game.updateState(4, 13.2, 20.4, 2.0);
        SaveFile save2 = game.saveGame();

        game.showState();
        game.loadSavedGame(save1);
        game.showState();
        game.loadSavedGame(save2);
        game.showState();
    }
}