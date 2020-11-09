package com.example.jbshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class AboutUsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        final TextView txt = (TextView) findViewById(R.id.txt);
        ListView listView = (ListView) findViewById(R.id.listview);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.optionsForAboutUs, android.R.layout.simple_list_item_1);
        listView.setAdapter(adapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(AboutUsActivity.this, AlmatyCity.class);
                    startActivity(intent);
                }
            }
        };
        listView.setOnItemClickListener(itemClickListener);

    }
}