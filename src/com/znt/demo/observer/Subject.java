package com.znt.demo.observer;

public interface Subject {

    void add(Observer observer);

    void del(Observer observer);

    void notifyObservers();

    void operation();

}
