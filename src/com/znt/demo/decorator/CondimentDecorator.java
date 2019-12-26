package com.znt.demo.decorator;

/**
 * 调料的抽象类
 */
public abstract class CondimentDecorator extends Beverage {

    //在子类中将方法又设置为抽象方法，还是觉得挺神奇的
    //不过，这样做的意义应该是让子类继承时，必须重写getDescription方法

    @Override
    public abstract String getDescription();

}
