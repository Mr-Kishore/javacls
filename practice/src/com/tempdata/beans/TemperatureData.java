package com.tempdata.beans;

public class TemperatureData {
    public static void main(String[] args) {
        Residential residential = new Residential();
        System.out.println(residential.getType());
        residential.setType("Individual House");
        System.out.println(residential.getType());

    }
}
