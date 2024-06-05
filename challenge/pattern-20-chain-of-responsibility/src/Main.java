public class Main {
    public static void main(String[] args) {
        ConveyorBelt conveyorBelt = new ConveyorBelt();

        Sorters.SquareSorter squareSorter = new Sorters.SquareSorter();
        Sorters.CircleSorter circleSorter = new Sorters.CircleSorter();
        Sorters.TriangleSorter triangleSorter = new Sorters.TriangleSorter();

        conveyorBelt.setStart(squareSorter);
        squareSorter.setNext(circleSorter);
        circleSorter.setNext(triangleSorter);

        conveyorBelt.sortShape("circle");
        conveyorBelt.sortShape("triangle");
        conveyorBelt.sortShape("square");
        conveyorBelt.sortShape("octagon");
    }
}