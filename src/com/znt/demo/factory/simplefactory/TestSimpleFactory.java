package com.znt.demo.factory.simplefactory;

import com.znt.demo.factory.shape.Shape;

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
