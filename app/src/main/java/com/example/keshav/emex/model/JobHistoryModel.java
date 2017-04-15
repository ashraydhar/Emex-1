package com.example.keshav.emex.model;

/**
 * Created by keshav on 13/4/17.
 */

public class JobHistoryModel {
    private String dateTime, distance, driverName, driverLocation, driverLocationCity, driverDestination, driverDestinationCity, jobAmount, rideTime;

    /**
     * @param dateTime           date time of job
     * @param distance           distance job
     * @param driverName         name driver
     * @param driverLocation     location of driver
     * @param driverLocationCity driver location city
     * @param rideTime           Time of Ride
     * @param jobAmount          amount of job
     * @param driverDestination  drivers destination
     */

    public JobHistoryModel(final String dateTime, final String distance, final String driverName, final String driverLocation,
                           final String driverLocationCity, final String driverDestination, final String jobAmount, final String rideTime) {
        this.dateTime = dateTime;
        this.distance = distance;
        this.driverName = driverName;
        this.driverLocation = driverLocation;
        this.driverLocationCity = driverLocationCity;
        this.driverDestination = driverDestination;
        this.driverDestinationCity = driverLocationCity;
        this.jobAmount = jobAmount;
        this.rideTime = rideTime;
    }

    /**
     * @return drivers destination
     */
    public String getDriverDestination() {
        return driverDestination;
    }

    /**
     * @param driverDestination drivers destination
     */
    public void setDriverDestination(final String driverDestination) {
        this.driverDestination = driverDestination;
    }

    /**
     * @return destination of the driver
     */
    public String getDriverDestinationCity() {
        return driverDestinationCity;
    }

    /**
     * @param driverDestinationCity driver's destination city
     */
    public void setDriverDestinationCity(final String driverDestinationCity) {
        this.driverDestinationCity = driverDestinationCity;
    }

    /**
     * @return amount of the job
     */
    public String getJobAmount() {
        return jobAmount;
    }

    /**
     * @param jobAmount amount of job
     */
    public void setJobAmount(final String jobAmount) {
        this.jobAmount = jobAmount;
    }

    /**
     * @return total ride time
     */
    public String getRideTime() {
        return rideTime;
    }

    /**
     * @param rideTime ride time
     */
    public void setRideTime(final String rideTime) {
        this.rideTime = rideTime;
    }

    /**
     * @return location of driver
     */
    public String getDriverLocationCity() {
        return driverLocationCity;
    }

    /**
     * @param driverLocationCity location of the driver
     */
    public void setDriverLocationCity(final String driverLocationCity) {
        this.driverLocationCity = driverLocationCity;
    }

    /**
     * @return time and date of driver job
     */
    public String getDateTime() {
        return dateTime;
    }

    /**
     * @param dateTime data and time of driver
     */
    public void setDateTime(final String dateTime) {
        this.dateTime = dateTime;
    }

    /**
     * @return distance of job
     */
    public String getDistance() {
        return distance;
    }

    /**
     * @param distance distance of the job
     */
    public void setDistance(final String distance) {
        this.distance = distance;
    }

    /**
     * @return driver's name
     */
    public String getDriverName() {
        return driverName;
    }

    /**
     * @param driverName name of the driver
     */
    public void setDriverName(final String driverName) {
        this.driverName = driverName;
    }

    /**
     * @return location of the driver
     */
    public String getDriverLocation() {
        return driverLocation;
    }

    /**
     * @param driverLocation location of driver
     */
    public void setDriverLocation(final String driverLocation) {
        this.driverLocation = driverLocation;
    }
}
