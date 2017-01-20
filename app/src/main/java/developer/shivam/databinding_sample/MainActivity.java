package developer.shivam.databinding_sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Item> itemList = new ArrayList<>();
    ListView lvFoodItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Add elements in list
        itemList.add(Item.createNewItem(1, "Paneer Tikka", 100));
        itemList.add(Item.createNewItem(2, "Chicken Tikka", 150));
        itemList.add(Item.createNewItem(3, "Chicken Lollipop", 200));

        lvFoodItems = (ListView) findViewById(R.id.lvFoodItems);
    }

    public class FoodItemsAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return itemList.size();
        }

        @Override
        public Object getItem(int position) {
            return itemList.get(position);
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            return null;
        }
    }
}
