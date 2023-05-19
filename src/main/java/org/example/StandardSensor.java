package org.example;

public class StandardSensor implements Sensor{
    private int oneNum;

    public StandardSensor(int oneNum) {
        this.oneNum = oneNum;
    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public int read() {
        return this.oneNum;
    }

    @Override
    public void setOn() {
    }

    @Override
    public void setOff() {
    }    
}