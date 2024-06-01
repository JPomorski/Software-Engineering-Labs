public interface TransitDriver {
    void setDispatcher(Dispatcher dispatcher);
    void requestPayload(int jobIndex);
    void completeDelivery();
    void browseJobs();
}
