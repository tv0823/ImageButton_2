package com.example.imagebutton_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import  java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView iV;
    ImageButton clickimg;
    Random rd = new Random();
    int num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iV = findViewById(R.id.iV);
        clickimg = findViewById(R.id.clickimg);
    }

    public void clicked(View view) {
        num = rd.nextInt(3)+1;
        if (num == 1)
        {
            iV.setImageResource(R.drawable.cat);
            clickimg.setImageResource(R.drawable.one);
        }
        if (num == 2)
        {
            iV.setImageResource(R.drawable.monkey);
            clickimg.setImageResource(R.drawable.two);
        }
        if (num == 3)
        {
            iV.setImageResource(R.drawable.dog);
            clickimg.setImageResource(R.drawable.three);
        }
    }
}