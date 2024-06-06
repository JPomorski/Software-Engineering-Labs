public class ConsoleLogger implements ActivityLogger {
    @Override
    public void logData() {
        System.out.println("Activity data logged to console");
    }
}
