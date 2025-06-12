package com.tempdata.beans;

public abstract class Building {
    private Floor[] floors;
    private String color;
    private String shape;
    private String name;
    private String noOfFloors;
    private float height;
    private int squareFeet;
    private boolean parking;

    public abstract void getEBBill();
}
