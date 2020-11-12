package com.myjava.ocp.pattern;

public class Subway {
    public static void main(String[] args) {
        Food food = new Bread();
        food = new Ham(food);
        food = new Ham(food);
        food = new Ham(food);
        food = new Egg(food);
        food = new Olives(food);
        food = new Onion(food);
        food = new Tomato(food);
        food = new Tomato(food);
        //food = new Tuna(food);
        food = new Lettuce(food);
        food = new Lettuce(food);
        
        System.out.println("您點的餐點有:"+food.getName());
        System.out.println("總額:"+food.getPrice()+"元");
    }
}
