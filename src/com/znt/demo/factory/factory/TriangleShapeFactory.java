package com.znt.demo.factory.factory;

import com.znt.demo.factory.shape.Shape;
import com.znt.demo.factory.shape.TriangleShape;

public class TriangleShapeFactory implements ShapeFactory {

    @Override
    public Shape getShape(){
        return  new TriangleShape();
    }

}
