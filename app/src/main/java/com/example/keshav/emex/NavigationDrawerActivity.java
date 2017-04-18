package com.example.keshav.emex;

import android.os.Handler;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.keshav.emex.Fragment.HomeFragment;
import com.example.keshav.emex.Fragment.JobHistoryFragment;
import com.example.keshav.emex.constants.Constants;

/**
 * Navigation drawer activtiy
 */
public class NavigationDrawerActivity extends AppCompatActivity implements Constants {


    private TextView tvHeader, tvJobHistory;
    private DrawerLayout mDrawerLayout;
    private ImageView ivMenu;


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_drawer);
        init();
        HomeFragment homeFragment = new HomeFragment();
        FragmentManager fM = getSupportFragmentManager();
        FragmentTransaction ft = fM.beginTransaction();
        ft.replace(R.id.flDisplay, homeFragment);
        ft.commit();

        tvHeader.setText(R.string.app_name);
        ivMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                mDrawerLayout.openDrawer(Gravity.START);
            }
        });
        tvJobHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                mDrawerLayout.closeDrawer(Gravity.START);


                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        JobHistoryFragment jobHistoryFragment = new JobHistoryFragment();
                        FragmentManager fM = getSupportFragmentManager();
                        FragmentTransaction ft = fM.beginTransaction();
                        ft.replace(R.id.flDisplay, jobHistoryFragment);
                        ft.commit();

                    }
                }, DELAY);


            }
        });

    }

    @Override
    public void init() {
        tvHeader = (TextView) findViewById(R.id.tvTitle);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.dl_side_menu);
        ivMenu = (ImageView) findViewById(R.id.ivMenu);
        tvJobHistory = (TextView) findViewById(R.id.tvJobHistory);
    }
}
