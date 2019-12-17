package com.znt.demo.bulider;

/**
 *  平房创建者
 */
public class BungalowBuilder implements  HouserBuilder {
    private House house = new House();

    @Override
    public void makeFloor() {
        house.setFloor("平房地板");
    }

    @Override
    public void makeWall() {
        house.setWall("平房墙");
    }

    @Override
    public void makeRoof() {
        house.setRoof("平房屋顶");
    }

    /**
     * 外界使用
     * */
    @Override
    public House getHouse() {
        return house;
    }

}
