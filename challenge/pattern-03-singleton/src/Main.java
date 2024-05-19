public class Main {
    public static void main(String[] args) {
        // DatabaseController controller = new DatabaseController();       // oczywiście nie działa

        DatabaseController controller = DatabaseController.getSelf();
        DatabaseController controller2 = DatabaseController.getSelf();
    }
}