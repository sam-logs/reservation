package com.railway.TrainDetails.models;

import javax.persistence.Entity;


@Entity
public class Train_details {

    @javax.persistence.Id
    private String id;


    private String trainName;


    private String depTime;


    private String origin;


    private String destination;


    private double fare;


    public Train_details() {
    }

    public Train_details(String id, String trainName, String depTime, String origin, String destination, double fare) {
        this.id = id;
        this.trainName = trainName;
        this.depTime = depTime;
        this.origin = origin;
        this.destination = destination;
        this.fare = fare;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public String getDepTime() {
        return depTime;
    }

    public void setDepTime(String depTime) {
        this.depTime = depTime;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getFare() {
        return fare;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }

    @Override
    public String toString() {
        return "Train Name =" + trainName + " depTime =" + depTime + " Origin =" + origin + " Destination =" + destination + " fare =" + fare;
    }
    /*
     * @Override public String toString() {
     * return
     * String.format("Train_details[id='%s',trainName='%s',depTime='%s'," +
     * "origin='%s',destination='%s']");
     *  }
     */

    /*
     * @Override public String toString() { return
     * String.format("Train[trainid = '%s', trainName = '%s', startStation = '%s',"
     * + " endStation = '%s', no_of_seats = '%s', duration = '%s']", trainid,
     * trainName, startStation, endStation, no_of_seats, duration); }
     */

}
