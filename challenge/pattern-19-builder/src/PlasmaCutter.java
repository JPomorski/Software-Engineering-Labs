public class PlasmaCutter implements MetalCutter {
    @Override
    public void takeMetalSheet() {
        System.out.println("Metal sheet in place");
    }

    @Override
    public void loadInstructions() {
        System.out.println("Instructions loaded");
    }

    @Override
    public void cut() {
        System.out.println("Cutting using plasma arc");
    }
}
