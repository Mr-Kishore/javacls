package com.tempdata.beans;

public class TemperatureSensor implements Sensor{
    private float temperature;

    public TemperatureSensor(float temperature) {
        this.temperature = temperature;
    }

    public float getReading() {
        return temperature;
    }


    public float setReading() {
        return 0;
    }
}
