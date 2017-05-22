package com.sailfish.observer.weatherobservable;

import java.util.Observable;

/**
 * 使用JDK内置的观察者模式
 * @author sailfish
 * @create 2017-05-20-下午3:28
 */
public class WeatherData extends Observable{
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
    }

    public void measurementsChanged() {
        //将Observable的changed改为true，表示有数据变化
        setChanged();
        notifyObservers();
    }


    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        //通知观察者
        measurementsChanged();
    }


    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
