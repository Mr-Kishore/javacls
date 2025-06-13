package com.tempdata.beans;

public class TemperatureSensor implements Sensor {
    private float temperature; // deffault Celsius

    public TemperatureSensor(float temperature) {
        this.temperature = temperature;
    }


    public float getReading() {
        return temperature; // returns in defaultunit
    }

    @Override
    public float getReading(String Unit) {
        if (Unit == null) return getReading();

        switch (Unit.toLowerCase()) {
            case "f":
                return (temperature * 9 / 5) + 32;
            default:
                return temperature;
        }
    }

    public static void main(String[] args) {

    }
}
