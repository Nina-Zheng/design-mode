package com.znt.demo.proxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxy implements MethodInterceptor {

    private Enhancer enhancer = new Enhancer();

    public Object getProxy(Class cla){
        enhancer.setSuperclass(cla);
        enhancer.setCallback(this);
        return  enhancer.create();
    }

    /**
     * 拦截所有目标类方法的调用
     * @param object 目标类的实例
     * @param method 目标方法的反射对象
     * @param args 方法的参数
     * @param methodProxy  代理类的实例
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {

        long startTime = System.currentTimeMillis();
        System.out.println("汽车开始行驶");
        //代理类调用父类的方法
        methodProxy.invokeSuper(object,args);
        long endTime = System.currentTimeMillis();
        System.out.println("汽车行驶结束，行驶时间为： "+ (endTime-startTime)+"ms");
        return null;
    }
}
