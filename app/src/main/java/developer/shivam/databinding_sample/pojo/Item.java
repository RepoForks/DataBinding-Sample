package developer.shivam.databinding_sample.pojo;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

public class Item extends BaseObservable {

    int id;
    String name;
    int price;

    public static Item createNewItem(int id, String name, int price) {
        Item item = new Item();
        item.id = id;
        item.name = name;
        item.price = price;
        return item;
    }

    @Bindable
    public int getId() {
        return id;
    }

    @Bindable
    public String getName() {
        return name;
    }

    @Bindable
    public int getPrice() {
        return price;
    }
}
