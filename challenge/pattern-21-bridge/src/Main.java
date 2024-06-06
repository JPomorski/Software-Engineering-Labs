public class Main {
    public static void main(String[] args) {
        GameServer gameServer = new GameServer(new ConsoleLogger());
        DatabaseServer dbServer = new DatabaseServer(new FileLogger());

        gameServer.logActivity();
        dbServer.logActivity();
    }
}