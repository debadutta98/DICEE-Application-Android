package com.diceeapp.dicee;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button rollback = (Button) findViewById(R.id.button);
        final ImageView i=(ImageView) findViewById(R.id.imageView_leftdice);
        final ImageView j=(ImageView) findViewById(R.id.imageView_rightdice);
        final int []arr={
          R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };
        rollback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int r=random.nextInt(5);
                int t=random.nextInt(5);
            i.setImageResource(arr[r]);
            j.setImageResource(arr[t]);
            }
    });
    }
}