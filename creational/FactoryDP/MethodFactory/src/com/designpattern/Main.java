/**
 * Main Class
 *
 * This class contains the main method to demonstrate the usage of the PizzaStore and Pizza classes.
 * It instantiates an AlexPizzaStore and orders a pizza of a specified type.
 */
package com.designpattern;

import com.designpattern.pizzamodel.Pizza;
import com.designpattern.pizzastores.AlexPizzaStore;
import com.designpattern.pizzastores.PizzaStore;

public class Main {

    public static void main(String[] args) {
	    PizzaStore pizzaStore = new AlexPizzaStore();
        Pizza pizza = pizzaStore.orderPizza("clam");
        System.out.println("pizza = " + pizza);
    }
}
