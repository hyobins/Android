package Lecture3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ListView;

import com.example.swe_project.R;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class AddressActivity extends AppCompatActivity {

    private ListView itemListView = null;
    private ArrayList<Item> list;
    EditText editTextFilter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address);
        editTextFilter = (EditText) findViewById(R.id.editTextFilter);
        itemListView = findViewById(R.id.addressList);
//        CustomListAdapter adapter = new CustomListAdapter(this, generateMyArrayList());
        list = generateMyArrayList();
        CustomListAdapter adapter = new CustomListAdapter(this, list);
        itemListView.setAdapter(adapter);

        //Filtering 기능 구현

        editTextFilter.addTextChangedListener(new TextWatcher(){
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // 입력란에 변화가 있 시 조치
                String filterText = s.toString();
                search(filterText);
                adapter.notifyDataSetChanged();
            }

            @Override
            public void afterTextChanged(Editable editTextFilter) {
                // 입력이 끝났을 때 조치
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // 입력하기 전에 조치
            }
        });
    }

    public void search(String charText){
        list.clear();
        if(charText.length()==0){
            list.addAll(generateMyArrayList());
        }
        else{
            for(int i=0;i<generateMyArrayList().size();i++){
                if(generateMyArrayList().get(i).getItemName().toLowerCase().contains(charText.toLowerCase()))
                {
                    list.add(generateMyArrayList().get(i));
                }
            }
        }
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