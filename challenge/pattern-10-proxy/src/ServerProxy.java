public class ServerProxy implements ServerBackupInterface {
    private ServerBackup server = null;

    private void createServer() {
        if(server == null) {
            server = new ServerBackup();
        }
    }

    @Override
    public void loadBackup() {
        createServer();
        server.loadBackup();
    }

    @Override
    public void showBackupLog() {
        createServer();
        server.showBackupLog();
    }
}
