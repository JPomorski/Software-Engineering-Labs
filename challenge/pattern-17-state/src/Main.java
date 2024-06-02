public class Main {
    public static void main(String[] args) {
        Supercar supercar = new Supercar();

        supercar.changeDriveMode(new DriveModes.Eco());
        supercar.changeDriveMode(new DriveModes.Sport());
        supercar.changeDriveMode(new DriveModes.Race());
    }
}