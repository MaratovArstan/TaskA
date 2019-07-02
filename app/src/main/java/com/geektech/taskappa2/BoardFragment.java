package com.geektech.taskappa2;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class BoardFragment extends Fragment {

    ImageView imageView;
    TextView textTittle;
    TextView textDesc;
    Button button;
    Button button1;
    OnBoardActivity activity;

    public BoardFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_board, container, false);
        imageView = view.findViewById(R.id.imageView);
        textTittle= view.findViewById(R.id.textTittle);
        textDesc = view.findViewById(R.id.textDesk);
         button = view.findViewById(R.id.button);
         button1 = view.findViewById(R.id.button2);
         activity = (OnBoardActivity)getActivity();
        RelativeLayout mBack = view.findViewById(R.id.m_background);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if (v==button){
                activity.onCancel();
            }
            }
        });
        int pos = getArguments().getInt("pos");
        switch (pos) {
            case 0:
                imageView.setImageResource(R.drawable.picture);
                textTittle.setText ("Shalom");
                button1.setVisibility(View.VISIBLE);
                mBack.setBackgroundColor(Color.BLUE);
                break;

            case 1:
                imageView.setImageResource(R.drawable.picturee);
                textTittle.setText("Comment ca va");
                button1.setVisibility(View.VISIBLE);
                mBack.setBackgroundColor(Color.BLACK);
                break;
            case 2:
                imageView.setImageResource(R.drawable.pictureee);
                textTittle.setText("Very well");
                button.setVisibility(View.VISIBLE);
                mBack.setBackgroundColor(Color.DKGRAY);
                break;
        }
        return  view;
    }

}
