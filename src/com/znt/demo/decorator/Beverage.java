package com.znt.demo.decorator;

/**
 * @description 饮料的抽象类
 */
public abstract class Beverage {

    String description = "Unknown beverage";

    public String getDescription(){
        return  description;
    }

    public abstract double cost();
}
