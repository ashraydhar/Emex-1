package com.example.keshav.emex.adaptor;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.keshav.emex.R;
import com.example.keshav.emex.constants.Constants;
import com.example.keshav.emex.model.JobHistoryModel;

import java.util.ArrayList;


/**
 * Created by keshav on 13/4/17.
 */

public class JobHistoryMissedAdaptor extends RecyclerView.Adapter<JobHistoryMissedAdaptor.ViewHolder> implements Constants {
    private ArrayList<JobHistoryModel> jobHistoryInfoList;
    private int mode;

    /**
     * @param mode               mode of adaptor to be used
     * @param jobHistoryInfoList arraylist contains the object of job history model
     */
    public JobHistoryMissedAdaptor(final int mode, final ArrayList<JobHistoryModel> jobHistoryInfoList) {
        this.jobHistoryInfoList = jobHistoryInfoList;
        this.mode = mode;
    }

    @Override
    public JobHistoryMissedAdaptor.ViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rowlayout_job_history, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final JobHistoryMissedAdaptor.ViewHolder holder, final int position) {
        JobHistoryModel jobHistoryInfo = jobHistoryInfoList.get(position);
        holder.tvTimeDate.setText(jobHistoryInfo.getDateTime());
        holder.tvDistance.setText(jobHistoryInfo.getDistance());
        holder.tvDriverLocation.setText(jobHistoryInfo.getDriverLocation());
        holder.tvDriverLocationCity.setText(jobHistoryInfo.getDriverLocationCity());
        if (mode == MISSEDJOB) {
            holder.tvRideTime.setText(jobHistoryInfo.getRideTime());
            holder.tvAmount.setText(jobHistoryInfo.getJobAmount());
            holder.tvDriverDistination.setText(jobHistoryInfo.getDriverDestination());
            holder.tvDriverDistinationCity.setText(jobHistoryInfo.getDriverDestinationCity());
        } else {
            holder.tvDriverName.setText(holder.tvDriverName.getText() + jobHistoryInfo.getDriverName());
        }
    }

    @Override
    public int getItemCount() {
        return jobHistoryInfoList.size();
    }

    @Override
    public void init() {

    }

    /**
     * inner viewHolder class contians the view to be inflated
     */
    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tvTimeDate, tvDistance, tvDriverName, tvDriverLocation, tvDriverLocationCity;
        private TextView tvDriverDistination, tvDriverDistinationCity, tvRideTime, tvAmount;
        private LinearLayout llPaymentDetails, llRideTime;
        private View vBar, vVerticalBar, vRedDot;

        /**
         * @param itemView reference of the view to be inflated
         */
        public ViewHolder(final View itemView) {
            super(itemView);
            tvTimeDate = (TextView) itemView.findViewById(R.id.tvTimeDate);
            tvDistance = (TextView) itemView.findViewById(R.id.tvDistance);
            tvDriverName = (TextView) itemView.findViewById(R.id.tvDriverName);
            tvDriverLocation = (TextView) itemView.findViewById(R.id.tvDriverLocation);
            tvDriverLocationCity = (TextView) itemView.findViewById(R.id.tvDriverLocationCity);
            tvDriverDistination = (TextView) itemView.findViewById(R.id.tvDriverDestination);
            tvDriverDistinationCity = (TextView) itemView.findViewById(R.id.tvDriverDestinationCity);
            tvRideTime = (TextView) itemView.findViewById(R.id.tvRideTime);
            tvAmount = (TextView) itemView.findViewById(R.id.tvAmount);
            llPaymentDetails = (LinearLayout) itemView.findViewById(R.id.llPaymentDetails);
            llRideTime = (LinearLayout) itemView.findViewById(R.id.llRideTime);
            vBar = itemView.findViewById(R.id.vBar);
            vRedDot = itemView.findViewById(R.id.vRedDot);
            vVerticalBar = itemView.findViewById(R.id.vVerticalBar);
            if (mode == MISSEDJOB) {
                tvDriverName.setVisibility(View.GONE);
            } else {
                tvDriverDistination.setVisibility(View.GONE);
                tvDriverDistinationCity.setVisibility(View.GONE);
                llPaymentDetails.setVisibility(View.GONE);
                llRideTime.setVisibility(View.GONE);
                vBar.setVisibility(View.GONE);
                vRedDot.setVisibility(View.GONE);
                vVerticalBar.setVisibility(View.GONE);
            }
        }
    }
}
