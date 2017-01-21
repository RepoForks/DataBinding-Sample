package developer.shivam.databinding_sample.adapter;

import android.databinding.DataBindingUtil;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

import developer.shivam.databinding_sample.R;
import developer.shivam.databinding_sample.databinding.FoodItemRowLayoutBinding;
import developer.shivam.databinding_sample.pojo.Item;

public class ItemAdapter extends BaseAdapter {

    private List<Item> mList;

    public ItemAdapter(List<Item> list) {
        mList = list;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Item getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        FoodItemRowLayoutBinding itemRowBinding = DataBindingUtil.inflate(layoutInflater, R.layout.food_item_row_layout, parent, false);
        itemRowBinding.setItem(getItem(position));
        return itemRowBinding.getRoot();
    }
}
