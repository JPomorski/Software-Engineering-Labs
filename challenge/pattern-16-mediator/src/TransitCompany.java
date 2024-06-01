import java.util.ArrayList;
import java.util.List;

public class TransitCompany {
    private final List<Payload> availablePayloads = new ArrayList<>();

    public void addPayload(Payload payload) {
        availablePayloads.add(payload);
    }

    public Payload getPayload(int jobIndex) {
        if(jobIndex >= 1 && jobIndex <= availablePayloads.size()) {
            Payload payload = availablePayloads.get(jobIndex - 1);
            availablePayloads.remove(jobIndex - 1);
            System.out.println("Job assigned successfully");
            return payload;
        } else {
            System.out.println("Invalid job index");
            return null;
        }
    }

    public void receivePayload(Payload payload) {
        System.out.println(payload.name() + " received");
    }

    public void showJobList() {
        if(availablePayloads.isEmpty()) {
            System.out.println("No jobs available");
            return;
        }

        System.out.println("Available jobs:");
        int index = 1;

        for(Payload payload : availablePayloads) {
            String payloadInfo = index + ". " + payload.name() + ": " + payload.weight() + "t";
            System.out.println(payloadInfo);
            index++;
        }
    }
}
