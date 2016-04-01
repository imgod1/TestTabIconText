package com.example.imgod.testtabicontext.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.imgod.testtabicontext.R;


public class OneFragment extends Fragment {

    public static final String TYPE = "type";
    private View parentView;
    private TextView txt_content;

    public OneFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        parentView = inflater.inflate(R.layout.fragment_one, container, false);
        initVIew();
        return parentView;
    }

    private void initVIew() {

        txt_content = (TextView) parentView.findViewById(R.id.txt_content);
        txt_content.setText(getArguments().getString(TYPE, "Default"));
    }

    public static OneFragment newInstance(String text) {
        OneFragment fragment = new OneFragment();
        Bundle bundle = new Bundle();
        bundle.putString(TYPE, text);
        fragment.setArguments(bundle);
        return fragment;
    }


}
