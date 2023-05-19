package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class AverageSensor implements Sensor {

    private List<Sensor> sensorsList;
    private List<Integer> averageTotalList;
   
    public AverageSensor() {
        List<Sensor> sensors = new ArrayList<>();
        this.sensorsList = sensors;
        List<Integer> averageTotalGroup = new ArrayList<>();
        this.averageTotalList = averageTotalGroup;
    }

    public void addSensor(Sensor toAdd){
        sensorsList.add(toAdd);
    }

    @Override
    public void setOn() {
        for (Sensor sensor : sensorsList) {
            sensor.setOn();
        }
    }

    @Override
    public void setOff() {
        for (Sensor sensor : sensorsList) {
            sensor.setOff();
        }
    }

    @Override
    public boolean isOn() {
        for (Sensor sensor : sensorsList) {
        if (!sensor.isOn()) {
            return false;
        } 
    }
    return true;
    }

    @Override
    public int read() {
        int fulltotal = 0;
        if (!isOn() || sensorsList.size() == 0) {
            throw new IllegalStateException();
        } else {
            for(Sensor sensor : sensorsList){
                fulltotal += sensor.read();
        }
        int aveTotal = fulltotal / sensorsList.size();
        averageTotalList.add(aveTotal);
        return aveTotal;
         }
    }
    public List<Integer> readings(){
        List<Integer> reading = new ArrayList<>();
        reading.addAll(averageTotalList);
        return reading;
    }
} 