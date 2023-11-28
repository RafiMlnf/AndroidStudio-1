package com.a4.helloapps;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class Menu extends AppCompatActivity {

    // Array untuk menyimpan teks
    private String[] texts = {"text1", "text2", "text3"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        // Mendapatkan referensi ke TextView
        TextView randomText = findViewById(R.id.textRandom);

        // Mendapatkan indeks acak
        int randomIndex = new Random().nextInt(texts.length);

        // Menampilkan teks secara acak
        randomText.setText(getStringResourceByName(texts[randomIndex]));
    }

    // Mendapatkan String Resource berdasarkan nama
    private String getStringResourceByName(String name) {
        String packageName = getPackageName();
        int resId = getResources().getIdentifier(name, "string", packageName);
        return getString(resId);
    }
}

