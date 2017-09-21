package codemakers.twoviewholders;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import java.util.ArrayList;
import java.util.List;

import codemakers.twoviewholders.adapters.ItemsAdapter;
import codemakers.twoviewholders.databinding.ActivityMainBinding;
import codemakers.twoviewholders.model.Item;
import codemakers.twoviewholders.model.Item1;
import codemakers.twoviewholders.model.Item2;

public class MainActivity extends AppCompatActivity {

    List<Item> data;
    ActivityMainBinding binding;
    ItemsAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        data =  new ArrayList<>();
        adapter =  new ItemsAdapter(data);
        binding.list.setAdapter(adapter);
        binding.list.setLayoutManager(new LinearLayoutManager(this));
        loadData();
    }

    public void loadData(){

        data.add(new Item1("Mensaje 1", "Titulo 1"));
        data.add(new Item2("Este un contenido 1"));
        data.add(new Item2("Este un contenido 2"));
        data.add(new Item1("Mensaje 2", "Titulo 2"));
        data.add(new Item2("Este un contenido 3"));
        adapter.notifyDataSetChanged();
    }
}
