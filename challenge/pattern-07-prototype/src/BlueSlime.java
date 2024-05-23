public class BlueSlime extends SlimeMob {
    public BlueSlime(int health, int strength) {
        super(health, strength);
    }

    @Override
    public SlimeMob cloneSelf() {
        return new BlueSlime(this.health, this.strength);
    }

    @Override
    public void inspect() {
        System.out.println("A blue, slimy creature");
        System.out.println("HP: " + this.health + "    " + "STR: " + this.strength);
    }
}
