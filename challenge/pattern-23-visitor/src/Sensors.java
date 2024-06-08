public class Sensors {
    public static class IgnitionSensor implements CarSensor {
        @Override
        public void calibrate(ControlUnit controlUnit) {
            controlUnit.runCheck(this);
        }
    }

    public static class FuelSensor implements CarSensor {
        @Override
        public void calibrate(ControlUnit controlUnit) {
            controlUnit.runCheck(this);
        }
    }

    public static class ParkingSensor implements CarSensor {
        @Override
        public void calibrate(ControlUnit controlUnit) {
            controlUnit.runCheck(this);
        }
    }
}
