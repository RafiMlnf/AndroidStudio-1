package com.a4.helloapps;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

public class Menu extends AppCompatActivity {

    private String[] texts = {"text1", "text2", "text3"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        TextView randomText = findViewById(R.id.textRandom);
        int randomIndex = new Random().nextInt(texts.length);
        randomText.setText(getStringResourceByName(texts[randomIndex]));

        Animation fadeIn = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in2sec );
        randomText.startAnimation(fadeIn);


        TextView textView = findViewById(R.id.textView);

        textView.setVisibility(View.VISIBLE);
        Animation fadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.fade_in1sec);
        textView.startAnimation(fadeInAnimation);


        ImageView imageViewAlarm = findViewById(R.id.imageViewAlarm);
        imageViewAlarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, Alarm.class);
                startActivity(intent);

                Animation popOffAnimation = AnimationUtils.loadAnimation(Menu.this, R.anim.popoff);
                imageViewAlarm.startAnimation(popOffAnimation);
                OnToggleClicked();

                overridePendingTransition(R.anim.slideleft, R.anim.slideright);
            }
        });

        ImageView imageView6 = findViewById(R.id.imageView6);
        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, ActivityMain.class);
                startActivity(intent);

                Animation popOffAnimation = AnimationUtils.loadAnimation(Menu.this, R.anim.popoff);
                imageView6.startAnimation(popOffAnimation);
                OnToggleClicked();

                overridePendingTransition(R.anim.slideleft, R.anim.slideright);
            }
        });

        ImageView imageView8 = findViewById(R.id.imageView8);
        imageView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, MainActivity1.class);
                startActivity(intent);

                Animation popOffAnimation = AnimationUtils.loadAnimation(Menu.this, R.anim.popoff);
                imageView8.startAnimation(popOffAnimation);
                OnToggleClicked();

                overridePendingTransition(R.anim.slideleft, R.anim.slideright);
            }
        });

        ImageView imageView7 = findViewById(R.id.imageView7);
        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, ScrollingIceCold.class);
                startActivity(intent);

                Animation popOffAnimation = AnimationUtils.loadAnimation(Menu.this, R.anim.popoff);
                imageView7.startAnimation(popOffAnimation);
                OnToggleClicked();

                overridePendingTransition(R.anim.slideleft, R.anim.slideright);
            }
        });

        ImageView imageView9 = findViewById(R.id.imageView9);
        imageView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, MainActivity.class);
                startActivity(intent);

                Animation popOffAnimation = AnimationUtils.loadAnimation(Menu.this, R.anim.popoff);
                imageView9.startAnimation(popOffAnimation);
                OnToggleClicked();

                overridePendingTransition(R.anim.slideleft, R.anim.slideright);
            }
        });


        ImageView imageView13 = findViewById(R.id.imageView13);
        imageView13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent mapIntent = new Intent(Intent.ACTION_VIEW);

                mapIntent.setPackage("com.google.android.apps.maps");

                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                }

                Animation popOffAnimation = AnimationUtils.loadAnimation(Menu.this, R.anim.popoff);
                imageView13.startAnimation(popOffAnimation);
                OnToggleClicked();

                overridePendingTransition(R.anim.slideleft, R.anim.slideright);
            }
        });
    }

    private String getStringResourceByName (String name){
        String packageName = getPackageName();
        int resId = getResources().getIdentifier(name, "string", packageName);
        return getString(resId);
    }

    private void OnToggleClicked() {
    }
}
