package com.example.keshav.emex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.keshav.emex.constants.Constants;

/**
 * signUp activity takes user info
 */
public class SignUpActivity extends AppCompatActivity implements Constants {
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
}
