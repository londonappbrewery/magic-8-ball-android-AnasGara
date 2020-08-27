package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.londonappbrewery.magiceightball.R;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button askButton= (Button) findViewById(R.id.askB);
        final ImageView ballImage= findViewById(R.id.Ball);
        final int[] ballArray={
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5,
        };
        askButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Random r=new Random();
                int num=r.nextInt(5);
                ballImage.setImageResource(ballArray[num]);
            }
        }
        );


    }


}
