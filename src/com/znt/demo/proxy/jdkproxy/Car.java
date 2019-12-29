package com.znt.demo.proxy.jdkproxy;

public class Car implements Moveable{

    @Override
    public void move() {
        try {
            System.out.println("Car汽车行驶中");
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
