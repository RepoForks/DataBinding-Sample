package developer.shivam.databinding_sample;

public class Item {

    private int id;
    private String name;
    private int price;

    public static Item createNewItem(int id, String name, int price) {
        Item item = new Item();
        item.id = id;
        item.name = name;
        item.price = price;
        return item;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
