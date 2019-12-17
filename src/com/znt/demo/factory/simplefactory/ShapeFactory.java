package com.znt.demo.factory.simplefactory;

import com.znt.demo.factory.shape.CircleShape;
import com.znt.demo.factory.shape.RectShape;
import com.znt.demo.factory.shape.Shape;
import com.znt.demo.factory.shape.TriangleShape;

public class ShapeFactory {

    public static Shape getShape(String type){
        Shape shape = null;

        if(type.equalsIgnoreCase("circle")){
            shape = new CircleShape();
        }else if(type.equalsIgnoreCase("rect")){
            shape = new RectShape();
        }else if(type.equalsIgnoreCase("triangle")){
            shape = new TriangleShape();
        }

        return shape;
    }

}
