package com.tempdata.beans;

import java.util.Calendar;

public class Residential extends Building {
    private String type;
    public void setType(String aType){
        type = aType;
    }
    public String getType(){
        return type;
    }
    @Override
    public void getEBBill() {

    }
}
