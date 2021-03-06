package com.znt.demo.bulider;

/**
 *  房子建造者（接口）
 */
public interface HouserBuilder {

    void makeFloor();
    void makeWall();
    void makeRoof();
    House getHouse();
}
