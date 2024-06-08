public class EngineECU implements ControlUnit {
    @Override
    public void runCheck(Sensors.IgnitionSensor sensor) {
        System.out.println("Checking ignition system:");
        System.out.println("-- Checking spark plugs...");
        System.out.println("-- Checking wires...");
        System.out.println("-- Checking ignition coil...");
        System.out.println("Check complete");
    }

    @Override
    public void runCheck(Sensors.FuelSensor sensor) {
        System.out.println("Checking fuel system:");
        System.out.println("-- Checking fuel injection...");
        System.out.println("-- Checking fuel pump...");
        System.out.println("-- Checking fuel lines...");
        System.out.println("Check complete");
    }

    @Override
    public void runCheck(Sensors.ParkingSensor sensor) {
        System.out.println("Checking parking system:");
        System.out.println("-- Checking parking sensors...");
        System.out.println("-- Checking rear-view camera...");
        System.out.println("-- Checking blind spot sensors...");
        System.out.println("Check complete");
    }
}
