package com.example.swe_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class AddressActivity extends AppCompatActivity {

    private ListView itemListView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_2);
        itemListView = findViewById(R.id.nameList);
        CustomListAdapter adapter = new CustomListAdapter(this, generateMyArrayList());
        itemListView.setAdapter(adapter);
    }

    private ArrayList<Item> generateMyArrayList(){
        String itemName[] = getResources().getStringArray(R.array.items_name);
        String itemDescription[] = getResources().getStringArray(R.array.item_description);

        ArrayList<Item> list = new ArrayList<>();

        for(int i=0;i<itemName.length;i++){
            list.add(new Item(itemName[i],itemDescription[i]));
        }

        return list;

    }
}