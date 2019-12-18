package com.znt.demo.factory.factory;

import com.znt.demo.factory.shape.Shape;

/**
 *  工厂模式测试类
 *
 * 设计
 * 1.先得知需要的功能
 * 2.知道功能对应的商品（N种）
 * 3.知道商品对应的生产总厂
 * 4.知道总厂下分别生产什么商品（N种商品N种厂家）
 *
 * 使用
 * 1.先创建工厂
 * 2.工厂生成商品
 * 3.使用商品
 */
public class TestFactory {

    public static void main(String[] agrs){

        ShapeFactory circleFactory = new CircleShapeFactory();
        Shape circle = circleFactory.getShape();
        circle.draw();

        ShapeFactory rectFactory = new RectShapeFactory();
        Shape rect = rectFactory.getShape();
        rect.draw();

        ShapeFactory triangleFactory = new TriangleShapeFactory();
        Shape triangle = triangleFactory.getShape();
        triangle.draw();

    }
}
