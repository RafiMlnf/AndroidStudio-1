package com.a4.helloapps;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.a4.helloapps.chat.ActivityPesan1;
import com.a4.helloapps.fragment.ViewPagerActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Random;

public class Menu extends AppCompatActivity {

    private String[] texts = {"text1", "text2", "text3", "text4", "text5"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        LinearLayout icIceCold = findViewById(R.id.icIceCold);
        LinearLayout icAlarm = findViewById(R.id.icAlarm);
        LinearLayout icHalo = findViewById(R.id.icHalo);
        LinearLayout icPesan = findViewById(R.id.icPesan);
        LinearLayout icFibonacci = findViewById(R.id.icFibonacci);
        LinearLayout icMovie = findViewById(R.id.icNewRow);
        LinearLayout icMaps = findViewById(R.id.icMaps);

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

        icIceCold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Menu.this, ActivityIceCold.class));

                Animation popOffAnimation = AnimationUtils.loadAnimation(Menu.this, R.anim.popoff);
                icIceCold.startAnimation(popOffAnimation);
                OnToggleClicked();

                overridePendingTransition(R.anim.slideleft, R.anim.slideright);
            }
        });

        icAlarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(android.provider.AlarmClock.ACTION_SET_ALARM);
                startActivity(intent);

                Animation popOffAnimation = AnimationUtils.loadAnimation(Menu.this, R.anim.popoff);
                icAlarm.startAnimation(popOffAnimation);
                OnToggleClicked();

                overridePendingTransition(R.anim.slideleft, R.anim.slideright);
            }
        });

        icHalo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Menu.this, ActivityHalo.class));

                Animation popOffAnimation = AnimationUtils.loadAnimation(Menu.this, R.anim.popoff);
                icHalo.startAnimation(popOffAnimation);
                OnToggleClicked();

                overridePendingTransition(R.anim.slideleft, R.anim.slideright);
            }
        });

        icPesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Menu.this, ActivityPesan1.class));

                Animation popOffAnimation = AnimationUtils.loadAnimation(Menu.this, R.anim.popoff);
                icPesan.startAnimation(popOffAnimation);
                OnToggleClicked();

                overridePendingTransition(R.anim.slideleft, R.anim.slideright);
            }
        });

        icFibonacci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Menu.this, ActivityCount.class));

                Animation popOffAnimation = AnimationUtils.loadAnimation(Menu.this, R.anim.popoff);
                icFibonacci.startAnimation(popOffAnimation);
                OnToggleClicked();

                overridePendingTransition(R.anim.slideleft, R.anim.slideright);
            }
        });

        icMovie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Menu.this, ViewPagerActivity.class));

                Animation popOffAnimation = AnimationUtils.loadAnimation(Menu.this, R.anim.popoff);
                icMovie.startAnimation(popOffAnimation);
                OnToggleClicked();

                overridePendingTransition(R.anim.slideleft, R.anim.slideright);
            }
        });
        icMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mapIntent = new Intent(Intent.ACTION_VIEW);
                mapIntent.setPackage("com.google.android.apps.maps");

                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + Uri.encode("Universitas Pelita Bangsa"));
                    mapIntent.setData(gmmIntentUri);
                    startActivity(mapIntent);

                    Animation popOffAnimation = AnimationUtils.loadAnimation(Menu.this, R.anim.popoff);
                    icMaps.startAnimation(popOffAnimation);
                    OnToggleClicked();

                    overridePendingTransition(R.anim.slideleft, R.anim.slideright);
                }
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


