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
import com.a4.helloapps.fragment.Sinopsis.SinopsisFireForce;
import com.a4.helloapps.fragment.Sinopsis.SinopsisJJK;
import com.a4.helloapps.fragment.Sinopsis.SinopsisJJKCG;
import com.a4.helloapps.fragment.Sinopsis.SinopsisKNY;
import com.a4.helloapps.fragment.Sinopsis.SinopsisMDD;
import com.a4.helloapps.fragment.Sinopsis.SinopsisNaruto;
import com.a4.helloapps.fragment.Sinopsis.SinopsisSXF;

public class Tab1 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab1, container, false);

        ImageView imageView = view.findViewById(R.id.jjk);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SinopsisJJK.class);
                startActivity(intent);

                Animation popOffAnimation = AnimationUtils.loadAnimation(getActivity(), R.anim.popoff);
                imageView.startAnimation(popOffAnimation);
                OnToggleClicked();

                getActivity().overridePendingTransition(R.anim.slideleft, R.anim.slideright);
            }
        });

        ImageView imageView1 = view.findViewById(R.id.jjkcg);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SinopsisJJKCG.class);
                startActivity(intent);

                Animation popOffAnimation = AnimationUtils.loadAnimation(getActivity(), R.anim.popoff);
                imageView1.startAnimation(popOffAnimation);
                OnToggleClicked();

                getActivity().overridePendingTransition(R.anim.slideleft, R.anim.slideright);
            }
        });

        ImageView imageView2 = view.findViewById(R.id.ff);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SinopsisFireForce.class);
                startActivity(intent);

                Animation popOffAnimation = AnimationUtils.loadAnimation(getActivity(), R.anim.popoff);
                imageView2.startAnimation(popOffAnimation);
                OnToggleClicked();

                getActivity().overridePendingTransition(R.anim.slideleft, R.anim.slideright);
            }
        });

        ImageView imageView3 = view.findViewById(R.id.naruto);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SinopsisNaruto.class);
                startActivity(intent);

                Animation popOffAnimation = AnimationUtils.loadAnimation(getActivity(), R.anim.popoff);
                imageView3.startAnimation(popOffAnimation);
                OnToggleClicked();

                getActivity().overridePendingTransition(R.anim.slideleft, R.anim.slideright);
            }
        });

        ImageView imageView4 = view.findViewById(R.id.kny);
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SinopsisKNY.class);
                startActivity(intent);

                Animation popOffAnimation = AnimationUtils.loadAnimation(getActivity(), R.anim.popoff);
                imageView4.startAnimation(popOffAnimation);
                OnToggleClicked();

                getActivity().overridePendingTransition(R.anim.slideleft, R.anim.slideright);
            }
        });

        ImageView imageView5 = view.findViewById(R.id.mdd);
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SinopsisMDD.class);
                startActivity(intent);

                Animation popOffAnimation = AnimationUtils.loadAnimation(getActivity(), R.anim.popoff);
                imageView5.startAnimation(popOffAnimation);
                OnToggleClicked();

                getActivity().overridePendingTransition(R.anim.slideleft, R.anim.slideright);
            }
        });

        ImageView imageView6 = view.findViewById(R.id.sxf);
        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SinopsisSXF.class);
                startActivity(intent);

                Animation popOffAnimation = AnimationUtils.loadAnimation(getActivity(), R.anim.popoff);
                imageView6.startAnimation(popOffAnimation);
                OnToggleClicked();

                getActivity().overridePendingTransition(R.anim.slideleft, R.anim.slideright);
            }
        });

        return view;
    }
    private void OnToggleClicked() {
    }
}

