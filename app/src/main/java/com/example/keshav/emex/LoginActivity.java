package com.example.keshav.emex;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Contains login form
 */
public class LoginActivity extends Base {
    private Button btnLogin;
    private Intent intent;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();
        btnLogin.setOnClickListener(LoginActivity.this);
    }


    @Override
    public void init() {
        btnLogin = (Button) findViewById(R.id.btnLogin);
    }

    @Override
    public void onClick(final View v) {
        int id = v.getId();
        switch (id) {
            case R.id.btnLogin:
                intent = new Intent(LoginActivity.this, NavigationDrawerActivity.class);
                startActivity(intent);
                finish();
                break;
            default:
                Toast.makeText(this, "Invalid input", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
