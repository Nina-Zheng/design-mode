package com.znt.demo.observer;

public class MySubject extends AbstractSubject {

    @Override
    public void operation(){
        notifyObservers();
    }
}
