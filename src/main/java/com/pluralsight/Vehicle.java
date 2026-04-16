package com.pluralsight;

public class Vehicle {
    private long vehicleId;
    private String makeModel;
    private String color;
    private int odometerReading;
    private float price;

    public Vehicle(long vehicleId, String makeModel, String color, int odometerReading, float price){
        this.vehicleId = vehicleId;
        this.makeModel = makeModel;
        this.color = color;
        this.odometerReading = odometerReading;
        this.price = price;

    }

    public long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getOdometerReading() {
        return odometerReading;
    }

    public void setOdometerReading(int odometerReading) {
        this.odometerReading = odometerReading;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }




}

//Create a Java application called vehicle-inventory. This application is intended
//to manage the inventory for a used car dealership. Users will use a menu to lookup
//vehicles or add vehicles to the list.

//Create a class named Vehicle. Add the following data members to it:
//vehicleId - a long (ex: 101121)
//makeModel - a string (ex: Ford Explorer)
//color - a string (ex: Red)
//odometerReading - an int (ex: 32775)
//price - a float (ex: 12250.00) (no Lamborghinis here!)
//Add a constructor and get/set methods for each property of the car.

