package com.example.streetpk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {
    private RecyclerView recycle;
    private RecyclerView.Adapter adapt;
    private RecyclerView.LayoutManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ArrayList<Items> itemlist=new ArrayList<>();
        itemlist.add(new Items(R.drawable.ic_ac_unit,"Line 1", "Line 2"));
        itemlist.add(new Items(R.drawable.ic_android,"Line 3", "Line 4"));
        itemlist.add(new Items(R.drawable.ic_sentiment,"Line 5", "Line 6"));
        itemlist.add(new Items(R.drawable.ic_ac_unit,"Line 7", "Line 8"));
        itemlist.add(new Items(R.drawable.ic_android,"Line 9", "Line 10"));
        itemlist.add(new Items(R.drawable.ic_sentiment,"Line 11", "Line 12"));
        itemlist.add(new Items(R.drawable.ic_ac_unit,"Line 13", "Line 14"));
        itemlist.add(new Items(R.drawable.ic_android,"Line 15", "Line 16"));
        itemlist.add(new Items(R.drawable.ic_sentiment,"Line 17", "Line 18"));
        itemlist.add(new Items(R.drawable.ic_ac_unit,"Line 19", "Line 20"));
        itemlist.add(new Items(R.drawable.ic_android,"Line 21", "Line 22"));
        itemlist.add(new Items(R.drawable.ic_sentiment,"Line 23", "Line 24"));
        itemlist.add(new Items(R.drawable.ic_ac_unit,"Line 25", "Line 26"));
        itemlist.add(new Items(R.drawable.ic_android,"Line 27", "Line 28"));
        itemlist.add(new Items(R.drawable.ic_sentiment,"Line 29", "Line 30"));
        itemlist.add(new Items(R.drawable.ic_ac_unit,"Line 31", "Line 32"));
        itemlist.add(new Items(R.drawable.ic_android,"Line 33", "Line 34"));
        itemlist.add(new Items(R.drawable.ic_sentiment,"Line 35", "Line 36"));
        recycle= findViewById(R.id.recycle);
        recycle.setHasFixedSize(true);
        manager= new LinearLayoutManager(this);
        adapt=new itemAdapter(itemlist);
        recycle.setLayoutManager(manager);
        recycle.setAdapter(adapt);

    }
}
