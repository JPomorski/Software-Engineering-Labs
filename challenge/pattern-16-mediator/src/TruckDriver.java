public class TruckDriver implements TransitDriver {
    private Dispatcher dispatcher;
    private Payload payload;

    public TruckDriver(Dispatcher dispatcher) {
        this.dispatcher = dispatcher;
    }

    @Override
    public void setDispatcher(Dispatcher dispatcher) {
        this.dispatcher = dispatcher;
    }

    @Override
    public void requestPayload(int jobIndex) {
        if(payload != null) {
            System.out.println("Cannot request more than one payload");
            return;
        }
        payload = dispatcher.requestPayload(jobIndex);
    }

    @Override
    public void completeDelivery() {
        if(payload == null) {
            System.out.println("No payload to deliver");
            return;
        }
        dispatcher.receivePayload(payload);
    }

    @Override
    public void browseJobs() {
        this.dispatcher.showJobList();
    }
}
