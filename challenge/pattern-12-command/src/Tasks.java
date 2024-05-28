public class Tasks {
    public static class CPUPowerUp implements Task {
        @Override
        public void execute() {
            System.out.println("CPU powered up");
        }
    }

    public static class MemoryPowerUp implements Task {
        @Override
        public void execute() {
            System.out.println("Memory powered up");
        }
    }

    public static class DrivePowerUp implements Task {
        @Override
        public void execute() {
            System.out.println("Hard drives powered up");
        }
    }

    public static class SystemLoad implements Task {
        @Override
        public void execute() {
            System.out.println("System loading in progress...");
        }
    }
}
