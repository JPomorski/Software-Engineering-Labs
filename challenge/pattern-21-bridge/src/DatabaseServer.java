public class DatabaseServer extends Server {
    public DatabaseServer(ActivityLogger logger) {
        super(logger);
    }

    @Override
    public void logActivity() {
        System.out.println("Database server logging activity...");
        logger.logData();
    }
}
