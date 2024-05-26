public class ServerBackup implements ServerBackupInterface {
    @Override
    public void loadBackup() {
        System.out.println("Loading very heavy backup");
    }

    @Override
    public void showBackupLog() {
        System.out.println("Showing very long backup log");
    }
}
