package com.example.jbshop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CategoryStickerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_sticker);
        CardView card1 = (CardView) findViewById(R.id.tizhprog);
        CardView card2 = (CardView) findViewById(R.id.privedence);
        CardView card3 = (CardView) findViewById(R.id.programmersLife);
        CardView card4 = (CardView) findViewById(R.id.jbStickers);
        CardView card5 = (CardView) findViewById(R.id.csgo);
        CardView card6 = (CardView) findViewById(R.id.memes);

        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callTizhProg();
            }
        });
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callPrivedence();
            }
        });
        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callProgrammersLife();
            }
        });
        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callJbStickers();
            }
        });
        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callCSGO();
            }
        });
        card6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callMemes();
            }
        });
    }

    public void callTizhProg() {
        Intent intent = new Intent(this, ListOfStickers.class);
        startActivity(intent);
    }

    public void callPrivedence() {
        Intent intent = new Intent(this, PrivedenceStickers.class);
        startActivity(intent);
    }

    public void callProgrammersLife() {
        Intent intent = new Intent(this, ProgrammersLifeSticker.class);
        startActivity(intent);
    }

    public void callJbStickers() {
        Intent intent = new Intent(this, JbSticker.class);
        startActivity(intent);
    }

    public void callCSGO() {
        Intent intent = new Intent(this, csgoStickers.class);
        startActivity(intent);
    }

    public void callMemes() {
        Intent intent = new Intent(this, MemeSticker.class);
        startActivity(intent);
    }


}