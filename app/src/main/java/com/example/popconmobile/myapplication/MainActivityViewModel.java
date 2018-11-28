package com.example.popconmobile.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.popconmobile.myapplication.ui.mainactivityviewmodel.MainActivityViewModelFragment;

public class MainActivityViewModel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity_view_model_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MainActivityViewModelFragment.newInstance())
                    .commitNow();
        }
    }
}
