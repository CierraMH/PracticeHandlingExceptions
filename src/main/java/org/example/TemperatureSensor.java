package org.example;

import java.util.Random;

public class TemperatureSensor implements Sensor {

    @Override
    public void setOff() {
    }
    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void setOn() {
    }

    @Override
    public int read() {
        if (!isOn()) {
           throw new IllegalStateException();
        }
        return new Random().nextInt(61) - 31;
    }
    
}