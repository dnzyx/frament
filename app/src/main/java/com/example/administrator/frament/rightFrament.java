package com.example.administrator.frament;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.fragment.R;

/**
 * Created by Administrator on 2017/9/24.
 */

public class rightFrament extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.right_frament,container,false);
        return  v;
    }
}
