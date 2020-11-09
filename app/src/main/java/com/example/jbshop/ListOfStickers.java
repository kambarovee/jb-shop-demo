package com.example.jbshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class ListOfStickers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_stickers);
        final TextView txt = (TextView) findViewById(R.id.txt);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.optionsForStickers, android.R.layout.simple_list_item_1);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(ListOfStickers.this, FirstStickerActivity.class);
                    startActivity(intent);
                }
                if (position == 1) {
                    Intent intent = new Intent(ListOfStickers.this, EtoNeBaga.class);
                    startActivity(intent);
                }
            }
        };
        ListView listView = (ListView) findViewById(R.id.listview);
        listView.setOnItemClickListener(itemClickListener);

    }
}