package com.znt.demo.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TimeInvocationHandle implements InvocationHandler {

    private Object target;

    public TimeInvocationHandle(Object target) {
        this.target = target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    /**
     * @param proxy  被代理对象
     * @param method  被代理对象的方法
     * @param args  方法的参数
     * @return
     * @throws Throwable
     */


    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long startTime = System.currentTimeMillis();
        System.out.println("汽车开始行驶");
        method.invoke(target, args);
        long endTime = System.currentTimeMillis();
        System.out.println("汽车行驶结束，行驶时间为： "+ (endTime-startTime)+"ms");

        return null;
    }
}
