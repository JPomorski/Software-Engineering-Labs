public class Supercar {
    private DriveMode driveMode;

    void changeDriveMode(DriveMode mode) {
        this.driveMode = mode;
        mode.showMessage();
        mode.changeEngineMap();
        mode.changeSpringStiffness();
        mode.alterRideHeight();
    }

    @SuppressWarnings("unused")
    public DriveMode getDriveMode() {
        return driveMode;
    }
}
