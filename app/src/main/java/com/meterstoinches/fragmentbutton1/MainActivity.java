package com.meterstoinches.fragmentbutton1;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void SelectButton(View view) {
        Fragment fr = null;
        if(view == findViewById(R.id.clickF1)){
            fr = new Fragment1();
        }else if(view == findViewById(R.id.clickF2)) {
            fr = new Fragment2();
        }else if (view == findViewById(R.id.clickF3)){
            fr = new Fragment3();
        }
        FragmentManager manager= getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.fragment,fr);
        transaction.commit();
    }
}
