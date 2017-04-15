package com.example.keshav.emex.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.keshav.emex.R;
import com.example.keshav.emex.adaptor.JobHistoryMissedAdaptor;
import com.example.keshav.emex.model.JobHistoryModel;

import java.util.ArrayList;

/**
 * Fragment contains the recycler view.
 */

public class SubJobHistoryFragment extends Fragment {
    private JobHistoryMissedAdaptor jobHistoryMissedAdaptor;
    private JobHistoryModel jobHistoryInfo;
    private ArrayList<JobHistoryModel> jobHistoryInfoList;
    private int mode;

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable final Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sub_job_history, container, false);
        Bundle bundle = this.getArguments();
        mode = bundle.getInt("mode");
        jobHistoryInfoList = new ArrayList<JobHistoryModel>();

        jobHistoryInfo = new JobHistoryModel("14 June, 2016 04:23 PM", "5.6 km", "Hitesh Gupta", "3846 W 38 Rd, Shiv Srishti Marg",
                "Mumbai", "Silver Oks Hospital, Laxmi Nagar", "1832.00", "20 min");

        jobHistoryInfoList.add(jobHistoryInfo);

        jobHistoryMissedAdaptor = new JobHistoryMissedAdaptor(mode, jobHistoryInfoList);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rvJobHistory);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(jobHistoryMissedAdaptor);
        return view;
    }
}
