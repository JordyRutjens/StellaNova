package com.demo.springboot.Logic;

import java.util.Date;

public class NearEarthObject
{
    private float speedInkilometers;
    private Date closeApproachDate;
    private String orbitingBody;
    private float diameterMinEstemate;
    private float diameterMaxEstemate;

    public NearEarthObject(float speedInkilometers, Date closeApproachDate, String orbitingBody, float diameterMinEstemate, float diameterMaxEstemate) {
        this.speedInkilometers = speedInkilometers;
        this.closeApproachDate = closeApproachDate;
        this.orbitingBody = orbitingBody;
        this.diameterMinEstemate = diameterMinEstemate;
        this.diameterMaxEstemate = diameterMaxEstemate;
    }

    public float getSpeedInkilometers() {
        return speedInkilometers;
    }

    public Date getCloseApproachDate() {
        return closeApproachDate;
    }

    public String getOrbitingBody() {
        return orbitingBody;
    }

    public float getDiameterMinEstemate() {
        return diameterMinEstemate;
    }

    public float getDiameterMaxEstemate() {
        return diameterMaxEstemate;
    }


}
