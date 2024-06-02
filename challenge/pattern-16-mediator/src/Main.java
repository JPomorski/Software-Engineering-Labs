public class Main {
    public static void main(String[] args) {
        TransitCompany sawmill = new TransitCompany();
        Dispatcher sawmillDispatcher = new Dispatcher();
        TruckDriver Marek =  new TruckDriver();
        VanDriver Mirek = new VanDriver();
        CBRadio sawmillRadio = new CBRadio();

        sawmill.setRadio(sawmillRadio);
        sawmillDispatcher.setRadio(sawmillRadio);
        Marek.setRadio(sawmillRadio);
        Mirek.setRadio(sawmillRadio);

        Marek.sendMessage("Any jobs available?");
        sawmillDispatcher.sendMessage("Only boards I'm afraid");
        sawmill.sendMessage("We've got logs too");
        Mirek.sendMessage("Bajo jajo bajo jajo");
    }
}