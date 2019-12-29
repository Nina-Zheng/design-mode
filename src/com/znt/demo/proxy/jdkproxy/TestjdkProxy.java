package com.znt.demo.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 *
 */
public class TestjdkProxy {

    public static void main(String[] args){
        Car  car = new Car();
        InvocationHandler h = new TimeInvocationHandle(car);
        Class<?> cls = car.getClass();
        /**
         * loader 被代理类的加载器
         * interface 实现接口
         * h InvocationHandler
         */
        Moveable m =(Moveable) Proxy.newProxyInstance(cls.getClassLoader(),cls.getInterfaces(),h);
        m.move();
    }
}
