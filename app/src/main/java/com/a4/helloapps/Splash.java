package com.a4.helloapps;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class Splash extends AppCompatActivity {
    private static final long SPLASH_DELAY = 1300;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        ImageView imageViewF = findViewById(R.id.imageViewF);
        TextView textViewR = findViewById(R.id.textViewR);

        ObjectAnimator exponentialOutF = ObjectAnimator.ofFloat(imageViewF, View.TRANSLATION_Y, 0, 130);
        exponentialOutF.setDuration(800);
        exponentialOutF.setInterpolator(new AccelerateInterpolator(2));

        ObjectAnimator exponentialOutR = ObjectAnimator.ofFloat(textViewR, View.TRANSLATION_Y, 0, -130);
        exponentialOutR.setDuration(800);
        exponentialOutR.setInterpolator(new AccelerateInterpolator(2));

        ObjectAnimator fadeInImage = ObjectAnimator.ofFloat(imageViewF, View.ALPHA, 0f, 1f);
        fadeInImage.setDuration(500);

        ObjectAnimator fadeInText = ObjectAnimator.ofFloat(textViewR, View.ALPHA, 0f, 1f);
        fadeInText.setDuration(500);

        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(exponentialOutF, exponentialOutR, fadeInImage, fadeInText);
        animatorSet.start();

        new Handler().postDelayed(() -> {
            Intent intent = new Intent(Splash.this, Menu.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
            finish();
        }, SPLASH_DELAY);
    }
}
