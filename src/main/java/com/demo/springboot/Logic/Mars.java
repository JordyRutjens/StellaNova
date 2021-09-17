package com.demo.springboot.Logic;

import java.util.Date;

public class Mars
{
    private int temperature;
    private int humidity;
    private Date time;
    private int dayID;

    public Mars(int temperature, int humidity, Date time, int dayID) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.time = time;
        this.dayID = dayID;
    }

    public int getTemperature() {
        return temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public Date getTime() {
        return time;
    }

    public int getdayID() {
        return dayID;
    }

}

