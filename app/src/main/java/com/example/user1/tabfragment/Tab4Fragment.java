package com.example.user1.tabfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by User1 on 12/12/2017.
 */

public class Tab4Fragment extends Fragment implements View.OnClickListener {

    private Button btnTest;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab4_fragment,container,false);

        btnTest = (Button) view.findViewById(R.id.btnTest4);

        btnTest.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(getActivity(), "Testing Button 4 Click", Toast.LENGTH_SHORT).show();
    }
}
