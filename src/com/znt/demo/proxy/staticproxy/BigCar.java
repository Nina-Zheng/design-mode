package com.znt.demo.proxy.staticproxy;

public class BigCar implements Moveable {
    @Override
    public void move() {
        try {
            System.out.println("BigCar汽车行驶中");
            Thread.sleep(1500);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
