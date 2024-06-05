public class Sorters {
    public static class SquareSorter implements ShapeSorter {
        private ShapeSorter next;

        @Override
        public void setNext(ShapeSorter next) {
            this.next = next;
        }

        @Override
        public void sort(String shape) {
            if(shape.equals("square")) {
                System.out.println("Square sorted");
            } else {
                if(next == null) {
                    System.out.println("Unknown shape, discarding");
                    return;
                }
                next.sort(shape);
            }
        }
    }

    public static class CircleSorter implements ShapeSorter {
        private ShapeSorter next;

        @Override
        public void setNext(ShapeSorter next) {
            this.next = next;
        }

        @Override
        public void sort(String shape) {
            if(shape.equals("circle")) {
                System.out.println("Circle sorted");
            } else {
                if(next == null) {
                    System.out.println("Unknown shape, discarding");
                    return;
                }
                next.sort(shape);
            }
        }
    }

    public static class TriangleSorter implements ShapeSorter {
        private ShapeSorter next;

        @Override
        public void setNext(ShapeSorter next) {
            this.next = next;
        }

        @Override
        public void sort(String shape) {
            if(shape.equals("triangle")) {
                System.out.println("Triangle sorted");
            } else {
                if(next == null) {
                    System.out.println("Unknown shape, discarding");
                    return;
                }
                next.sort(shape);
            }
        }
    }
}
