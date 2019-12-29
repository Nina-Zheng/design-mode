package com.znt.demo.proxy.cglibproxy;

public class Car {

    public void move() {
        try {
            System.out.println("Car汽车行驶中");
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}
