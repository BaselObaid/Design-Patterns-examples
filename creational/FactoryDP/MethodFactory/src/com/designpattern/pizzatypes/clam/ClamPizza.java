package com.designpattern.pizzatypes.clam;

import com.designpattern.pizzamodel.Pizza;

import java.util.Arrays;
import java.util.List;
/**
 * ClamPizza Class
 *
 * This class is a concrete subclass of Pizza, representing a generic Clam pizza.
 * It follows the template pattern, providing a default set of properties and toppings for all Clam pizzas.
 * Subclasses can further customize the pizza by extending this class and adding specific toppings.
 */
public abstract class ClamPizza extends Pizza {
    List<String> toppings = Arrays.asList("Clams", "grated parmesan cheese");
    public ClamPizza(){
        setName("Clam");
        setDough("thin Crust");
        setSauce("white garlic");
        setToppings(toppings);
    }
}
