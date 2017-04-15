package com.example.keshav.emex;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.keshav.emex.constants.Constants;

/**
 * signUp activity takes user info
 */
public class SignUpActivity extends Base {
    private TextView tvHeader;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        init();
        tvHeader.setText(R.string.signup);
    }

    @Override
    public void init() {
        tvHeader = (TextView) findViewById(R.id.tvTitle);
    }

    @Override
    public void onClick(View v) {

    }
}
