package com.znt.demo.factory.factory;

import com.znt.demo.factory.shape.CircleShape;
import com.znt.demo.factory.shape.Shape;

public class CircleShapeFactory implements ShapeFactory {

    @Override
    public Shape getShape(){
        return new CircleShape();
    }

}
