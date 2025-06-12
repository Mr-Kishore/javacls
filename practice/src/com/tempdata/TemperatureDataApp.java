package com.tempdata;

import com.tempdata.beans.Sensor;
import com.tempdata.beans.TemperatureSensor;

public class TemperatureDataApp {
    public static void main(String[] args) {
        Sensor tempSensor = new TemperatureSensor(25);
        System.out.println(tempSensor.getReading());

    }
}
