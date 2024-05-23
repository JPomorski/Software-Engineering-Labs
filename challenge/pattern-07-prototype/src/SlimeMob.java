public abstract class SlimeMob {
    protected int health;
    protected int strength;

    public SlimeMob(int health, int strength) {
        this.health = health;
        this.strength = strength;
    }

    public abstract SlimeMob cloneSelf();
    public abstract void inspect();
}
