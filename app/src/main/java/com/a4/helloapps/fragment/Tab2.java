package com.a4.helloapps.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.a4.helloapps.R;
import com.a4.helloapps.fragment.Sinopsis.SinopsisJohnWick;
import com.a4.helloapps.fragment.Sinopsis.SinopsisOppenheimer;

public class Tab2 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab2, container, false);

        ImageView imageView = view.findViewById(R.id.oppenheimer);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SinopsisOppenheimer.class);
                startActivity(intent);

                Animation popOffAnimation = AnimationUtils.loadAnimation(getActivity(), R.anim.popoff);
                imageView.startAnimation(popOffAnimation);
                OnToggleClicked();

                getActivity().overridePendingTransition(R.anim.slideleft, R.anim.slideright);
            }
        });

        ImageView imageView2 = view.findViewById(R.id.johnwick);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SinopsisJohnWick.class);
                startActivity(intent);

                Animation popOffAnimation = AnimationUtils.loadAnimation(getActivity(), R.anim.popoff);
                imageView2.startAnimation(popOffAnimation);
                OnToggleClicked();

                getActivity().overridePendingTransition(R.anim.slideleft, R.anim.slideright);
            }
        });

        return view;
    }
    private void OnToggleClicked() {
    }
}