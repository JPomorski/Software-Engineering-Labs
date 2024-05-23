public class GreenSlime extends SlimeMob {
    public GreenSlime(int health, int strength) {
        super(health, strength);
    }

    @Override
    public SlimeMob cloneSelf() {
        return new GreenSlime(this.health, this.strength);
    }

    @Override
    public void inspect() {
        System.out.println("A green, slimy creature");
        System.out.println("HP: " + this.health + "    " + "STR: " + this.strength);
    }
}
