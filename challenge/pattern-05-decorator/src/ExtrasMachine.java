public class ExtrasMachine implements CakeMachine {
    protected CakeMachine cakeMachine;

    public ExtrasMachine(CakeMachine cakeMachine) {
        this.cakeMachine = cakeMachine;
    }

    @Override
    public void makeCake() {
        cakeMachine.makeCake();
    }
}
