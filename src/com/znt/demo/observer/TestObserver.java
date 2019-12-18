package com.znt.demo.observer;

public class TestObserver {

    public static void main(String[] agrs){
        Subject sub = new MySubject();
        sub.add(new Observer1());
        sub.add(new Observer2());

        sub.operation();
    }
}
