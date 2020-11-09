package com.example.jbshop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class tshirtCategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tshirt_category);
        CardView card1 = (CardView) findViewById(R.id.tshirt1);
        CardView card2 = (CardView) findViewById(R.id.tshirt2);
        CardView card3 = (CardView) findViewById(R.id.tshirt3);
        CardView card4 = (CardView) findViewById(R.id.tshirt4);
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callFirst();
            }
        });
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callSecond();
            }
        });
        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callThird();
            }
        });
        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callFourth();
            }
        });
    }

    public void callFirst() {
        Intent intent = new Intent(this, FirstTshirt.class);
        startActivity(intent);
    }

    public void callSecond() {
        Intent intent = new Intent(this, secondTshirt.class);
        startActivity(intent);
    }

    public void callThird() {
        Intent intent = new Intent(this, thirdTshirt.class);
        startActivity(intent);
    }

    public void callFourth() {
        Intent intent = new Intent(this, FourthTshirt.class);
        startActivity(intent);
    }

}