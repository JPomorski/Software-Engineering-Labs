public class Main {
    public static void main(String[] args) {
        TransitCompany sawmill = new TransitCompany();
        Dispatcher sawmillDispatcher = new Dispatcher(sawmill);
        TruckDriver Marek =  new TruckDriver(sawmillDispatcher);

        sawmill.addPayload(new Payload("Boards", 20.6));
        sawmill.addPayload(new Payload("Pine Logs", 14.0));

        Marek.browseJobs();
        Marek.requestPayload(1);
        Marek.browseJobs();

        TransitCompany factory = new TransitCompany();
        Dispatcher factoryDispatcher = new Dispatcher(factory);
        Marek.setDispatcher(factoryDispatcher);

        factory.addPayload(new Payload("Wooden Furniture", 8.0));

        Marek.completeDelivery();
        Marek.browseJobs();
    }
}