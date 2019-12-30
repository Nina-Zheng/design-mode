package com.znt.demo.adapter;

public class ClassAdapterTest {

    public static void main(String[] args){

        System.out.println("类适配器模式测试： ");
        Target target = new ClassAdapter();
        target.request();

        System.out.println("对象适配器模式测试：");
        Adaptee adaptee = new Adaptee();
        Target target1 = new ObjectAdapter(adaptee);
        target1.request();
    }
}
