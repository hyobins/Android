package Lecture3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;

import com.example.swe_project.R;

import java.io.FilterReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class CustomListAdapter extends BaseAdapter{
    private Context context;
    private ArrayList<Item> items;

//    private ArrayList<Item> filtereditems = items;
//    Filter listFilter;

    //생성자
    public CustomListAdapter(Context context, ArrayList<Item> items){
        this.context = context;
        this.items = items;
    }


    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){
            convertView = LayoutInflater.from(context).
                    inflate(R.layout.layout_list_view_row_items, parent, false);
        }

        Item currentItem = (Item) getItem(position);

        TextView textViewItemName = (TextView)
                convertView.findViewById(R.id.text_view_item_name);
        TextView textViewItemDescription = (TextView)
                convertView.findViewById(R.id.text_view_item_description);

        textViewItemName.setText(currentItem.getItemName());
        textViewItemDescription.setText(currentItem.getItemDescription());

        return convertView;
    }




//    private class ListFilter extends Filter{
//        @Override
//        protected FilterResults performFiltering(CharSequence constraint){
//
//            FilterResults results = new FilterResults();
//
//            if(constraint == null || constraint.length() == 0){
//                results.values = items;
//                results.count = items.size();
//            }else{
//                ArrayList<Item> itemList = new ArrayList<Item>() ;
//
//                for (Item item : items) {
//                    itemList.add(item) ;
//                }
//
//                results.values = itemList ;
//                results.count = itemList.size() ;
//            }
//
//            return results;
//        }
//
//        @Override
//        protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
//
//        }
//
//    }
}
