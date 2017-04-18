package com.example.keshav.emex;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


/**
 * signUp activity takes user info
 */
public class SignUpActivity extends Base {
    private TextView tvHeader;
    private ImageView ivMenu;
    private Button btnSignUp;
    private Intent intent;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        init();
        ivMenu.setImageResource(R.drawable.ic_keyboard_arrow_left_black_24dp);
        tvHeader.setText(R.string.signup);
        ivMenu.setOnClickListener(SignUpActivity.this);
        btnSignUp.setOnClickListener(SignUpActivity.this);
    }

    @Override
    public void init() {
        tvHeader = (TextView) findViewById(R.id.tvTitle);
        ivMenu = (ImageView) findViewById(R.id.ivMenu);
        btnSignUp = (Button) findViewById(R.id.btnSignUp);
    }

    @Override
    public void onClick(final View v) {
        int id = v.getId();
        switch (id) {
            case R.id.ivMenu:
                finish();
                break;
            case R.id.btnSignUp:
                intent = new Intent(SignUpActivity.this, NavigationDrawerActivity.class);
                startActivity(intent);
                break;
            default:
                Toast.makeText(this, "Invalid input", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
