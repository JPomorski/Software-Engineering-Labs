public interface ControlUnit {
    void runCheck(Sensors.IgnitionSensor sensor);
    void runCheck(Sensors.FuelSensor sensor);
    void runCheck(Sensors.ParkingSensor sensor);
}
