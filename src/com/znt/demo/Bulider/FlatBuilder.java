package com.znt.demo.Bulider;

public class FlatBuilder implements HouserBuilder {

    private House house = new House();

    @Override
    public void makeFloor() {
        house.setFloor("公寓地板");
    }

    @Override
    public void makeWall() {
        house.setWall("公寓墙");
    }

    @Override
    public void makeRoof() {
        house.setRoof("公寓屋顶");
    }

    @Override
    public House getHouse() {
        return house;
    }

}
