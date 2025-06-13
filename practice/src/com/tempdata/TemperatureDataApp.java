package com.tempdata;

import com.tempdata.beans.Building;
import com.tempdata.beans.Commercial;
import com.tempdata.beans.Sensor;
import com.tempdata.beans.TemperatureSensor;

public class TemperatureDataApp {

    public static void main(String[] args) {
        Commercial.Parking commercialParking = new Commercial.Parking();
        commercialParking.print();
    }
}
