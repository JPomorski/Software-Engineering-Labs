public class DriveModes {
    public static class Eco implements DriveMode {
        @Override
        public void showMessage() {
            System.out.println("Eco mode selected");
        }

        @Override
        public void changeEngineMap() {
            System.out.println("Reduced engine power and fuel usage");
        }

        @Override
        public void changeSpringStiffness() {
            System.out.println("Reduced suspension stiffness");
        }

        @Override
        public void alterRideHeight() {
            System.out.println("Raised ride height");
        }
    }

    public static class Sport implements DriveMode {
        @Override
        public void showMessage() {
            System.out.println("Sport mode selected");
        }

        @Override
        public void changeEngineMap() {
            System.out.println("Standard engine power");
        }

        @Override
        public void changeSpringStiffness() {
            System.out.println("Medium suspension stiffness");
        }

        @Override
        public void alterRideHeight() {
            System.out.println("Standard ride height");
        }
    }

    public static class Race implements DriveMode {
        @Override
        public void showMessage() {
            System.out.println("Race mode selected");
        }

        @Override
        public void changeEngineMap() {
            System.out.println("Increased engine power");
        }

        @Override
        public void changeSpringStiffness() {
            System.out.println("Increased suspension stiffness");
        }

        @Override
        public void alterRideHeight() {
            System.out.println("Lowered ride height");
        }
    }
}
