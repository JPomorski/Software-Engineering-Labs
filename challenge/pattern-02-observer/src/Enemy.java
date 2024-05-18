public class Enemy implements Observer {
    private String name;

    public Enemy(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println(this.name + " updated player info");
    }
}
