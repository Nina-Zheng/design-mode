package com.znt.demo.observer;

import java.util.ArrayList;
import java.util.List;


/**
 * 抽象类里面可以有非抽象方法
 */
public  abstract  class AbstractSubject  implements Subject{

    private List<Observer> list = new ArrayList<>();

    @Override
    public void add(Observer observer){
        list.add(observer);
    }

    @Override
    public void del(Observer observer){
        list.remove(observer);
    }

    @Override
    public void notifyObservers(){
        for (Observer o:list) {
            o.update();
        }
    }




}
