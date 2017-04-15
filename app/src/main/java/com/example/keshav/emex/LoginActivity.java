package com.example.keshav.emex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.keshav.emex.constants.Constants;

/**
 * Contains login form
 */
public class LoginActivity extends AppCompatActivity implements Constants {
    private Button btnLogin;
    private Intent intent;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                intent = new Intent(LoginActivity.this, NavigationDrawerActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }


    @Override
    public void init() {
        btnLogin = (Button) findViewById(R.id.btnLogin);
    }
}
