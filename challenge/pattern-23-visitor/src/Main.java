public class Main {
    public static void main(String[] args) {
        EngineECU ecu = new EngineECU();

        CarSensor ignitionSensor = new Sensors.IgnitionSensor();
        CarSensor fuelSensor = new Sensors.FuelSensor();
        CarSensor parkingSensor = new Sensors.ParkingSensor();

        ignitionSensor.calibrate(ecu);
        fuelSensor.calibrate(ecu);
        parkingSensor.calibrate(ecu);
    }
}