public class MonitorAdapter implements DisplayPortMonitor {
    private final HDMIMonitor targetMonitor;

    public MonitorAdapter(HDMIMonitor targetMonitor) {
        this.targetMonitor = targetMonitor;
    }

    @Override
    public void receiveVideoData() {
        this.targetMonitor.receiveData();
    }
}
