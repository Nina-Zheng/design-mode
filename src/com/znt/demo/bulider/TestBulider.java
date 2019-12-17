package com.znt.demo.bulider;

/**
 * 测试类
 */
public class TestBulider {

    public static void main(String[] args){

        //建造者
        HouserBuilder builder = new BungalowBuilder();
        //指导者
        HouseDirector director = new HouseDirector(builder);
        //指导工作
        director.makeHouse();
        House house = builder.getHouse();
        System.out.println(house.toString());

    }
}
