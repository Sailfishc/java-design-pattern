package com.sailfish.observer.weather;

/**
 * 测试类
 * @author sailfish
 * @create 2017-05-20-下午2:54
 */
public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        //注册观察者
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        //设置Weather的值
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
/*
Current conditions: 80.0F degrees and 65.0% humidity
Current conditions: 82.0F degrees and 70.0% humidity
Current conditions: 78.0F degrees and 90.0% humidity
 */