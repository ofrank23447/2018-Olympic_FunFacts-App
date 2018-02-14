package com.example.ofran.funfacts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class FunFactActivity extends AppCompatActivity {

    private TextView funFact;
    private Button nextFact;
    private RelativeLayout relativeLayout;

    private FactBook factBook = new FactBook();
    private ColorWheel colorWheel = new ColorWheel();

    public int color;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_fact);

        funFact = findViewById(R.id.factView);
        nextFact = findViewById(R.id.nextFact);
        relativeLayout = findViewById(R.id.relativeLayout);

        View.OnClickListener listen = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    String fact = factBook.getFact();
                    funFact.setText(fact);
                    color = colorWheel.getColor();
                    relativeLayout.setBackgroundColor(color);
                    nextFact.setTextColor(color);

            }
         };
        nextFact.setOnClickListener(listen);
        }
    }

