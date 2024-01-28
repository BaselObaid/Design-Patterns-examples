package com.designpattern.pizzatypes.pepperoni;

import com.designpattern.pizzamodel.Pizza;


import java.util.Arrays;
import java.util.List;
/**
 * PepperoniPizza Class
 *
 * This class is a concrete subclass of Pizza, representing a generic Pepperoni pizza.
 * It follows the template pattern, providing a default set of properties and toppings for all Pepperoni pizzas.
 * Subclasses can further customize the pizza by extending this class and adding specific toppings.
 */
public abstract class PepperoniPizza extends Pizza {
    List<String> toppings = Arrays.asList("sliced pepperoni", "sliced onion", "grated parmesan cheese");
    public PepperoniPizza(){
        setName("Pepperoni");
        setDough("Crust");
        setSauce("Marinara");
        setToppings(toppings);
    }
}
