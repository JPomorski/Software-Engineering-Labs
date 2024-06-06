public class GameServer extends Server {
    public GameServer(ActivityLogger logger) {
        super(logger);
    }

    @Override
    public void logActivity() {
        System.out.println("Game server logging activity...");
        logger.logData();
    }
}
