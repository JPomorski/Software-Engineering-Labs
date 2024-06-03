import java.util.List;

public class Main {
    public static void main(String[] args) {
        Context itemList = new Context();
        itemList.addItem(1, "Wood");
        itemList.addItem(2, "Iron");
        itemList.addItem(4, "Sticks");
        itemList.addItem(5, "Pickaxe Head");
        itemList.addItem(10, "Pickaxe");

        itemList.addItem(-1, "Invalid recipe");

        Item wood1 = new Item(1);
        Item wood2 = new Item(1);

        Recipes.Combine sticks = new Recipes.Combine(List.of(wood1, wood2));
        System.out.println("Item crafted: " + itemList.getItem(sticks.evaluate()));

        Item iron1 = new Item(2);
        Item iron2 = new Item(2);
        Item iron3 = new Item(2);

        Recipes.Combine pickaxeHead = new Recipes.Combine(List.of(iron1, iron2, iron3));
        Recipes.Combine pickaxe = new Recipes.Combine(List.of(sticks, pickaxeHead));

        System.out.println("Item crafted: " + itemList.getItem(pickaxeHead.evaluate()));
        System.out.println("Item crafted: " + itemList.getItem(pickaxe.evaluate()));
    }
}