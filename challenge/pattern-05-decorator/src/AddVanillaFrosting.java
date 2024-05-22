public class AddVanillaFrosting extends ExtrasMachine {
    public AddVanillaFrosting(CakeMachine cakeMachine) {
        super(cakeMachine);
    }

    @Override
    public void makeCake() {
        cakeMachine.makeCake();
        System.out.println("+ vanilla frosting");
    }
}
