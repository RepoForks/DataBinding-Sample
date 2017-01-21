package developer.shivam.databinding_sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import developer.shivam.databinding_sample.adapter.ItemAdapter;
import developer.shivam.databinding_sample.pojo.Item;

public class MainActivity extends AppCompatActivity {

    ListView lvItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvItems = (ListView) findViewById(R.id.lvListItems);
        List<Item> itemList = new ArrayList<>();
        itemList.add(Item.createNewItem(1, "Panner Tikka", 100));
        itemList.add(Item.createNewItem(2, "Panner Bhujia", 150));
        itemList.add(Item.createNewItem(3, "Malai Kofta", 200));
        itemList.add(Item.createNewItem(4, "Chicken Lollipop", 100));
        itemList.add(Item.createNewItem(5, "Chicken Tandoori", 150));
        itemList.add(Item.createNewItem(6, "Chiken Kofta", 200));
        itemList.add(Item.createNewItem(7, "Chole Bhature", 100));
        itemList.add(Item.createNewItem(8, "Veg Roll", 150));
        itemList.add(Item.createNewItem(9, "Veg Thali", 200));
        lvItems.setAdapter(new ItemAdapter(itemList));
    }
}
