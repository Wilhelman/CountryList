package com.example.guillermogs2.countrylist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountryListActivity extends AppCompatActivity {

    private RecyclerView country_list_view;
    private List<String> countries;
    private CountryListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {//ep
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_list);

        String[] array_countries = getResources().getStringArray(R.array.countries);
        countries = Arrays.asList(array_countries);

        country_list_view = findViewById(R.id.country_list_view);
        country_list_view.setLayoutManager(new LinearLayoutManager(this));

        adapter = new CountryListAdapter(this,countries);
        country_list_view.setAdapter(adapter);
        country_list_view.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));

        adapter.setOnClickListener(new CountryListAdapter.OnClickListener(){
            @Override
            public void onClick(int position) {
                Toast.makeText(CountryListActivity.this,"Clicked" + position, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
