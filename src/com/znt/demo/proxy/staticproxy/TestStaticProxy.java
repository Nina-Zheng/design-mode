package com.znt.demo.proxy.staticproxy;

public class TestStaticProxy {

    /**
     * 1. 如果需要先记录时间，再记录日志，调换下代理的顺序即可
     * 2. 代理传递 从car到log，再到time
     */
    public static void main(String[] args){
        //无代理
        Car car = new Car();
        car.move();
        System.out.println();

        //存在日志代理
        CarLogProxy log = new CarLogProxy(car);
        log.move();
        System.out.println();


        //存在日志和时间代理
        CarTimeProxy time = new CarTimeProxy(log);
        time.move();
        System.out.println();

        //多种车类型，只要实现Moveable接口，就可以实现日志和时间代理
        BigCar bigCar = new BigCar();
        log = new CarLogProxy(bigCar);
        time = new CarTimeProxy(log);
        time.move();
    }
}
