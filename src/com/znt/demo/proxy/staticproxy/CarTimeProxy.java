package com.znt.demo.proxy.staticproxy;

/**
 * 时间代理类
 */
public class CarTimeProxy implements Moveable {

    private Moveable m;

    public CarTimeProxy(Moveable m){
        this.m = m;
    }

    @Override
    public void move() {
        long startTime = System.currentTimeMillis();
        System.out.println("汽车开始行驶");
        m.move();
        long endTime = System.currentTimeMillis();
        System.out.println("汽车行驶结束，行驶时间为： "+ (endTime-startTime)+"ms");

    }
}
