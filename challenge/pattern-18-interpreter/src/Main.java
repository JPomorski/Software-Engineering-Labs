import java.util.List;

public class Main {
    public static void main(String[] args) {
        Context itemList = new Context();
        itemList.addItem(1, "Wood");
        itemList.addItem(2, "Iron");
        itemList.addItem(3, "Planks");
        itemList.addItem(4, "Sticks");
        itemList.addItem(5, "Pickaxe Head");
        itemList.addItem(9, "Iron Nuggets");
        itemList.addItem(10, "Pickaxe");

        itemList.addItem(-1, "Invalid recipe");

        Item wood = new Item(1);
        Recipe planks1 = new Recipes.Convert(wood);
        Recipe planks2 = new Recipes.Convert(wood);
        System.out.println("Item crafted: " + itemList.getItem(planks1.evaluate()));

        Recipe sticks = new Recipes.Combine(List.of(planks1, planks2));
        System.out.println("Item crafted: " + itemList.getItem(sticks.evaluate()));

        Item iron1 = new Item(2);
        Item iron2 = new Item(2);
        Item iron3 = new Item(2);

        Recipe pickaxeHead = new Recipes.Combine(List.of(iron1, iron2, iron3));
        Recipe pickaxe = new Recipes.Combine(List.of(sticks, pickaxeHead));

        System.out.println("Item crafted: " + itemList.getItem(pickaxeHead.evaluate()));
        System.out.println("Item crafted: " + itemList.getItem(pickaxe.evaluate()));
    }
}