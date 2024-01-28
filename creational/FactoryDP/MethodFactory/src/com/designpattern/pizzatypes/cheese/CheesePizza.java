package com.designpattern.pizzatypes.cheese;

import com.designpattern.pizzamodel.Pizza;

import java.util.Arrays;
import java.util.List;
/**
 * CheesePizza Class
 *
 * This class is a concrete subclass of Pizza, representing a generic cheese pizza.
 * It follows the template pattern, providing a default set of properties and toppings for all cheese pizzas.
 * Subclasses can further customize the pizza by extending this class and adding specific toppings.
 */
public abstract class CheesePizza extends Pizza {
    List<String> toppings = Arrays.asList("fresh mozzarella", " parmesan cheese");
    public CheesePizza(){
        setName("Cheese");
        setDough("Regular Crust");
        setSauce("Marinara");
        setToppings(toppings);
    }
}
