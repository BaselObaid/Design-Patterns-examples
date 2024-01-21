package com.designpattern;

public class Main {

    public static void main(String[] args) {

        // simple order
        PizzaStore pizzaStore = new PizzaStore();
        Pizza pizza = pizzaStore.orderPizza("Veggie");
        if(pizza == null){
            System.out.println("wrong order");
        }
        else{
            System.out.println(pizza);
        }

        // enter to win
        PizzaStore pizzaStore1 = new PizzaStore();
        Pizza pizza1 = pizzaStore1.winPizza(2, "cheese");
        if(pizza1 == null){
            System.out.println("bad luck");
        }
        else{
            System.out.println(pizza1);
        }

        // you can't choose! we will do that for you
        PizzaStore pizzaStore2 = new PizzaStore();
        Pizza pizza2 = pizzaStore2.getRandomPizza();
        System.out.println(pizza2);


    }
}
