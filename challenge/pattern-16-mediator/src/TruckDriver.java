public class TruckDriver {
    private CBRadio radio;

    public void setRadio(CBRadio radio) {
        this.radio = radio;
    }

    public void sendMessage(String message) {
        radio.broadcast(message);
    }
}
