package com.znt.demo.decorator;


public class StarbuzzCoffee {

    public static void main(String[] agrs){

        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()+" $"+beverage.cost());

        Beverage beverage1 = new HouseBlend();
        beverage1 = new Soy(beverage1);
        System.out.println(beverage1.getDescription()+" $"+beverage1.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() +" $"+ beverage2.cost());
    }
}
