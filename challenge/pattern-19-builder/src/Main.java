public class Main {
    public static void main(String[] args) {
        CNCMachine cnc = new CNCMachine();

        cnc.cutMetalSheet(new PlasmaCutter());
        cnc.cutMetalSheet(new LaserCutter());
    }
}