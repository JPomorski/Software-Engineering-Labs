public class Main {
    public static void main(String[] args) {
        SlimeMob greenSlime1 = new GreenSlime(3, 4);
        SlimeMob greenSlime2 = greenSlime1.cloneSelf();

        greenSlime1.inspect();
        greenSlime2.inspect();

        SlimeMob blueSlime1 = new BlueSlime(13, 5);
        SlimeMob blueSlime2 = blueSlime1.cloneSelf();
        blueSlime2.inspect();
    }
}