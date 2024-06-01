public class Dispatcher {
    private final TransitCompany company;

    public Dispatcher(TransitCompany company) {
        this.company = company;
    }

    public Payload requestPayload(int jobIndex) {
        return company.getPayload(jobIndex);
    }

    public void receivePayload(Payload payload) {
        company.receivePayload(payload);
    }

    public void showJobList() {
        company.showJobList();
    }
}
