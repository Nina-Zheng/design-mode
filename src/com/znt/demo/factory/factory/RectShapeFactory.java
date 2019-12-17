package com.znt.demo.factory.factory;

import com.znt.demo.factory.shape.RectShape;
import com.znt.demo.factory.shape.Shape;

public class RectShapeFactory implements ShapeFactory {
    @Override
    public Shape getShape(){
        return new RectShape();
    }

}
