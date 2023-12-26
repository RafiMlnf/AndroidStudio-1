package com.a4.helloapps;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.a4.helloapps.alarm.ActivityAlarm;
import com.a4.helloapps.chat.ActivityPesan1;
import com.a4.helloapps.fragment.ViewPagerActivity;
import java.util.Calendar;

import java.util.Random;

public class Menu extends AppCompatActivity {

    private String[] texts = {"text1", "text2", "text3", "text4", "text5"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        // Random teks menu
        TextView randomText = findViewById(R.id.textRandom);
        int randomIndex = new Random().nextInt(texts.length);
        randomText.setText(getStringResourceByName(texts[randomIndex]));

        Animation fadeIn = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in2sec );
        randomText.startAnimation(fadeIn);

        // Salam
        TextView textView = findViewById(R.id.textGreeting);
        Calendar calendar = Calendar.getInstance();
        int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY);

        String greeting = getGreeting(hourOfDay);
        textView.setText(greeting + ", Rafi");

        // Transisi fade in opening teks
        textView.setVisibility(View.VISIBLE);
        Animation fadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.fade_in1sec);
        textView.startAnimation(fadeInAnimation);


        ImageView imageViewAlarm = findViewById(R.id.imageViewAlarm);
        imageViewAlarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, ActivityAlarm.class);
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
                Intent intent = new Intent(Menu.this, ActivityHalo.class);
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
                Intent intent = new Intent(Menu.this, ActivityPesan1.class);
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
                Intent intent = new Intent(Menu.this, ActivityIceCold.class);
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
                Intent intent = new Intent(Menu.this, ActivityCount.class);
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
                    Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + Uri.encode("Universitas Pelita Bangsa"));
                    mapIntent.setData(gmmIntentUri);
                    startActivity(mapIntent);
                }

                Animation popOffAnimation = AnimationUtils.loadAnimation(Menu.this, R.anim.popoff);
                imageView13.startAnimation(popOffAnimation);
                OnToggleClicked();

                overridePendingTransition(R.anim.slideleft, R.anim.slideright);
            }
        });


        ImageView imageView14 = findViewById(R.id.imageView14);
        imageView14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, ViewPagerActivity.class);
                startActivity(intent);

                Animation popOffAnimation = AnimationUtils.loadAnimation(Menu.this, R.anim.popoff);
                imageView14.startAnimation(popOffAnimation);
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

    private String getGreeting(int hourOfDay) {
        String greeting;

        if (hourOfDay >= 4 && hourOfDay < 12) {
            greeting = "Selamat Pagi";
        } else if (hourOfDay >= 12 && hourOfDay < 17) {
            greeting = "Selamat Siang";
        } else if (hourOfDay >= 17 && hourOfDay < 20) {
            greeting = "Selamat Sore";
        } else {
            greeting = "Selamat Malam";
        }
        return greeting;
    }
}

