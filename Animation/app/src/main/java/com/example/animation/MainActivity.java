package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Animation animTranslate,animAlpha;
    Button btnAlpha, btnTranslate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        define animation
        animAlpha = AnimationUtils.loadAnimation(this,R.anim.anim_alpha);
        animTranslate = AnimationUtils.loadAnimation(this, R.anim.anim_translate);

//        define button
        btnAlpha = findViewById(R.id.btnAlpha);
        btnTranslate = findViewById(R.id.btnTranslate);

        btnAlpha.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                arg0.startAnimation(animAlpha);

            }
        });

        btnTranslate.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                arg0.startAnimation(animTranslate);


            }
        });

    }
}
