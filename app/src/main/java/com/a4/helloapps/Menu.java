package com.a4.helloapps;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;
import android.annotation.SuppressLint;
import androidx.cardview.widget.CardView;

public class Menu extends AppCompatActivity {

    private String[] texts = {"text1", "text2", "text3"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        TextView randomText = findViewById(R.id.textRandom);
        int randomIndex = new Random().nextInt(texts.length);
        randomText.setText(getStringResourceByName(texts[randomIndex]));

        Animation fadeIn = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in);
        randomText.startAnimation(fadeIn);


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
    }

    private String getStringResourceByName (String name){
        String packageName = getPackageName();
        int resId = getResources().getIdentifier(name, "string", packageName);
        return getString(resId);
    }

    private void OnToggleClicked() {
    }
}
