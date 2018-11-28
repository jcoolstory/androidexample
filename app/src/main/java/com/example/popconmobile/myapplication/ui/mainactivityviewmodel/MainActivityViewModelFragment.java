package com.example.popconmobile.myapplication.ui.mainactivityviewmodel;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.popconmobile.myapplication.R;

public class MainActivityViewModelFragment extends Fragment {

    private MainActivityViewModelViewModel mViewModel;

    public static MainActivityViewModelFragment newInstance() {
        return new MainActivityViewModelFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.main_activity_view_model_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(MainActivityViewModelViewModel.class);
        // TODO: Use the ViewModel
    }

}
