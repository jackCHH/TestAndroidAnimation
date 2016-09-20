package com.example.jackhou.animationtutorial;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView icon = (ImageView) findViewById(R.id.icon);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.rotate_clockwise);
        icon.startAnimation(animation);


    }
}
