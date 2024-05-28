public class Main {
    public static void main(String[] args) {
        PC computer = new PC();

        Tasks.CPUPowerUp startCPU = new Tasks.CPUPowerUp();
        Tasks.MemoryPowerUp startMemory = new Tasks.MemoryPowerUp();
        Tasks.DrivePowerUp startDrives = new Tasks.DrivePowerUp();
        Tasks.SystemLoad startSystem = new Tasks.SystemLoad();

        computer.addTask(startCPU);
        computer.addTask(startMemory);
        computer.addTask(startDrives);
        computer.addTask(startSystem);

        computer.powerOn();
    }
}