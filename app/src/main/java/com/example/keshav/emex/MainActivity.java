package com.example.keshav.emex;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.keshav.emex.constants.Constants;

/**
 * Main Activity
 */
public class MainActivity extends AppCompatActivity implements Constants {
    private Button btnSignUp, btnLogin;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                btnSignUp.setVisibility(View.VISIBLE);
                btnLogin.setVisibility(View.VISIBLE);
            }
        }, SPLASH_TIMER);

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                Intent intent = new Intent(MainActivity.this, SignUpActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    /**
     * initialize all variables
     */
    public void init() {
        btnSignUp = (Button) findViewById(R.id.btnLogin);
        btnLogin = (Button) findViewById(R.id.btnSignUp);
        btnSignUp.setVisibility(View.INVISIBLE);
        btnLogin.setVisibility(View.INVISIBLE);
    }
}
