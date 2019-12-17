package com.znt.demo.bulider;

/**
 * 指导者（类似项目经理）
 */
public class HouseDirector {

    private HouserBuilder houserBuilder;

    public HouseDirector(HouserBuilder houserBuilder){
        this.houserBuilder = houserBuilder;
    }

    public void makeHouse(){
        houserBuilder.makeWall();
        houserBuilder.makeRoof();
        houserBuilder.makeFloor();
    }
}
