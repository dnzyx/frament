package com.example.administrator.frament;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.administrator.fragment.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rb1=(Button) findViewById(R.id.rB1);
        rb1.setOnClickListener(this);
        replace(new leftFrament());
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.rB1:
                replace(new l2());
                break;
        }
    }
    private void replace(Fragment fragment){
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ts=fm.beginTransaction();
        ts.replace(R.id.leftframent,fragment);
        ts.addToBackStack(null);
        ts.commit();
    }
}
