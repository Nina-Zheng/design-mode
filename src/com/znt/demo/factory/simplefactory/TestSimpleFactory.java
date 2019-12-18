package com.znt.demo.factory.simplefactory;

import com.znt.demo.factory.shape.Shape;

/**
 * 简单工厂模式 测试类
 */
public class TestSimpleFactory {

    public static void main(String[] args){
        Shape circle = ShapeFactory.getShape("circle");
        circle.draw();

        Shape rect = ShapeFactory.getShape("rect");
        rect.draw();

        Shape triangle = ShapeFactory.getShape("triangle");
        triangle.draw();

    }

}
