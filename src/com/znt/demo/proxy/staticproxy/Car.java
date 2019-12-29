package com.znt.demo.proxy.staticproxy;

/**
 * 汽车类
 */
public class Car implements Moveable {
    // 实现开车，并记录汽车行驶时间

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
