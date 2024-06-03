public record Item(int id) implements Recipe {

    @Override
    public String evaluate(Context context) {
        return context.getItem(id);
    }
}
