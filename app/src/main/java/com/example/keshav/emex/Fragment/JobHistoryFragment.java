package com.example.keshav.emex.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


import com.example.keshav.emex.R;
import com.example.keshav.emex.constants.Constants;

/**
 * contains job History of User
 */

public class JobHistoryFragment extends Fragment implements Constants {
    private ViewPager viewPager;
    private Button btnJobHistory, btnMissedJob;

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable final Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_job_history, container, false);
        initViews(view);
        btnJobHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                viewPager.setCurrentItem(0);
                v.setBackgroundResource(R.color.colorAccent);
                btnMissedJob.setBackgroundResource(R.color.colorPrimaryDark);

            }
        });
        btnMissedJob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                viewPager.setCurrentItem(1);
                v.setBackgroundResource(R.color.colorAccent);
                btnJobHistory.setBackgroundResource(R.color.colorPrimaryDark);

            }
        });
        return view;
    }

    /**
     * Methods for view init
     *
     * @param view paretnt view
     */
    private void initViews(final View view) {
        viewPager = (ViewPager) view.findViewById(R.id.vpJobPager);
        btnJobHistory = (Button) view.findViewById(R.id.btnJobHistory);
        btnMissedJob = (Button) view.findViewById(R.id.btnMissedJobs);
    }

    @Override
    public void init() {


    }

    @Override
    public void onActivityCreated(@Nullable final Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        FragmentStatePagerAdapter mStatePagerAdapter = new FragmentStatePagerAdapter(getChildFragmentManager()) {
            @Override
            public Fragment getItem(final int position) {
                if (position == 0) {
                    SubJobHistoryFragment subJobHistoryfragment = new SubJobHistoryFragment();
                    Bundle bundle = new Bundle();
                    bundle.putInt("mode", HISTORYJOB);
                    subJobHistoryfragment.setArguments(bundle);
                    return subJobHistoryfragment;
                }
                SubJobHistoryFragment subJobHistoryfragment1 = new SubJobHistoryFragment();
                Bundle bundle = new Bundle();
                bundle.putInt("mode", MISSEDJOB);
                subJobHistoryfragment1.setArguments(bundle);
                return subJobHistoryfragment1;


            }

            @Override
            public int getCount() {
                return 2;
            }
        };

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(final int position, final float positionOffset, final int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(final int position) {
                if (position == 1) {
                    btnMissedJob.setBackgroundResource(R.color.colorAccent);
                    btnJobHistory.setBackgroundResource(R.color.colorPrimaryDark);
                } else {
                    btnMissedJob.setBackgroundResource(R.color.colorPrimaryDark);
                    btnJobHistory.setBackgroundResource(R.color.colorAccent);
                }
            }

            @Override
            public void onPageScrollStateChanged(final int state) {

            }
        });
        viewPager.setAdapter(mStatePagerAdapter);
    }


}
