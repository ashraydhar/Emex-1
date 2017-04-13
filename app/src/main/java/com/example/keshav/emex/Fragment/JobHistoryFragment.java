package com.example.keshav.emex.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.keshav.emex.R;
import com.example.keshav.emex.constants.Constants;

/**
 * contains job History of User
 */

public class JobHistoryFragment extends Fragment implements Constants {
    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable final Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_job_history, container, false);
        init();
        return view;
    }

    @Override
    public void init() {


    }
}
