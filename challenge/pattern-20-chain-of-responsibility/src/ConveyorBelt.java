public class ConveyorBelt {
    private ShapeSorter start;

    public void setStart(ShapeSorter start) {
        this.start = start;
    }

    public void sortShape(String shape) {
        if(start == null) {
            System.out.println("No sorters connected");
            return;
        }
        start.sort(shape);
    }
}
