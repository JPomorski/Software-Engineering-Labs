public abstract class Server {
    protected final ActivityLogger logger;

    public Server(ActivityLogger logger) {
        this.logger = logger;
    }

    public abstract void logActivity();
}
