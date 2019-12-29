package com.znt.demo.proxy.cglibproxy;

public class TestCglibProxy {

    public static void main(String[] args){
        CglibProxy cglibProxy = new CglibProxy();
        Car car = (Car) cglibProxy.getProxy(Car.class);
        car.move();
    }
}
