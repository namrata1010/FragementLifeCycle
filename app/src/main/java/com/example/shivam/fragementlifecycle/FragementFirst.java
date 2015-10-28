package com.example.shivam.fragementlifecycle;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by shivam on 10/12/2015.
 */
public class FragementFirst extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(getActivity().getBaseContext(), "Fragement A:onCreate", Toast.LENGTH_LONG).show();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Toast.makeText(getActivity().getBaseContext(), "Fragement A:onCreateView", Toast.LENGTH_LONG).show();
        View view= inflater.inflate(R.layout.fragement_first,container,false);
        TextView txt=(TextView)view.findViewById(R.id.fragement1_txt);
        txt.setText("I am first fragement");


        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Toast.makeText(getActivity().getBaseContext(), "Fragement A:onAttach", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Toast.makeText(getActivity().getBaseContext(), "Fragement A :onViewCreated", Toast.LENGTH_LONG).show();

    }

    @Override
    public void onDetach() {
        super.onDetach();
        Toast.makeText(getActivity().getBaseContext(), "Fragement A:onDetach", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(getActivity().getBaseContext(), "Fragement A:onDestroye", Toast.LENGTH_LONG).show();

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Toast.makeText(getActivity().getBaseContext(), "Fragement A:onDestroye", Toast.LENGTH_LONG).show();
    }
}
