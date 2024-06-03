public class Item implements Recipe {
    private final int id;

    public Item(int id) {
        this.id = id;
    }

    @Override
    public int evaluate() {
        return id;
    }
}
