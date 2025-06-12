package com.tempdata.beans;

import java.util.Calendar;

public class Industrial extends Building {
    private Calendar openHours;
    private Calendar closeHours;

    public void setOpenHours(Calendar openHours){
        this.openHours = openHours;
    }
    public Calendar getOpenHours(){
        return openHours;
    }
    public void setCloseHours(Calendar closeHours){
        this.closeHours = closeHours;
    }

    public Calendar getCloseHours() {
        return closeHours;
    }

    @Override
    public void getEBBill() {

    }
}
