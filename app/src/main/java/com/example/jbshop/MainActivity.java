package com.example.jbshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button stickerButton = (Button) findViewById(R.id.stickerbtn);
        Button tshirtButton = (Button) findViewById(R.id.tshirtbtn);
        Button aboutusButton = (Button) findViewById(R.id.aboutusbtn);

        stickerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callStickers();
            }
        });
        tshirtButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callTshirts();
            }
        });
        aboutusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callAboutus();
            }
        });
    }

    public void callStickers() {
        Intent intent = new Intent(this, CategoryStickerActivity.class);
        startActivity(intent);
    }

    public void callTshirts() {
        Intent intent = new Intent(this, tshirtCategoryActivity.class);
        startActivity(intent);
    }

    public void callAboutus() {
        Intent intent = new Intent(this, AboutUsActivity.class);
        startActivity(intent);
    }
}