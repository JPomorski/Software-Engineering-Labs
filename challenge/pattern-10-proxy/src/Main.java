public class Main {
    public static void main(String[] args) {
        ServerProxy server = new ServerProxy();
        server.loadBackup();
        server.showBackupLog();
    }
}