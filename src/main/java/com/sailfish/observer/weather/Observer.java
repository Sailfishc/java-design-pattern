package com.sailfish.observer.weather;

/**
 * 观察者接口
 *
 * @author sailfish
 * @create 2017-05-20-下午2:40
 */
public interface Observer {
    //表示更新当前内容
    void update(float temperature, float humidity, float pressure);
}
