public class Main {
    public static void main(String[] args) {
        HDMIMonitor monitor = new HDMIMonitor();
        MonitorAdapter adapter = new MonitorAdapter(monitor);
        adapter.receiveVideoData();
    }
}