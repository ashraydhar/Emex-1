package com.example.keshav.emex;

import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;


/**
 * Main Activity
 */
public class MainActivity extends Base {
    private Button btnSignUp, btnLogin;
    private Intent intent;

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

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case (R.id.btnSignUp):
                intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
                break;
            case (R.id.btnLogin):
                intent = new Intent(MainActivity.this, SignUpActivity.class);
                startActivity(intent);
                break;
            default:
                Toast.makeText(this, "Invalid input", Toast.LENGTH_SHORT).show();
                break;

        }
    }
}
