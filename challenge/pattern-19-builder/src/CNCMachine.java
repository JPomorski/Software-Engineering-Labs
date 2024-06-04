public class CNCMachine {
    public void cutMetalSheet(MetalCutter machine) {
        machine.takeMetalSheet();
        machine.loadInstructions();
        machine.cut();
    }
}
