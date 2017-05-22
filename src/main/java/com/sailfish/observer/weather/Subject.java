package com.sailfish.observer.weather;

/**
 * 主题（数据的生产者）
 * @author sailfish
 * @create 2017-05-20-下午2:38
 */
public interface Subject {
    /**
     * 注册观察者
     * @param observer
     */
    void registerObserver(Observer observer);

    /**
     * 删除观察者
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * 通知观察者
     */
    void notifyObservers();
}
