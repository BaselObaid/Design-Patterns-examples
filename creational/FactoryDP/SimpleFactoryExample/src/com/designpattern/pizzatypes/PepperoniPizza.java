package com.designpattern.pizzatypes;

import com.designpattern.Pizza;


import java.util.Arrays;
import java.util.List;
/**
 * PepperoniPizza Class
 *
 * The PepperoniPizza class is a concrete subclass of Pizza, representing a pizza with sliced pepperoni, sliced onion, and grated parmesan cheese toppings.
 */
public class PepperoniPizza extends Pizza {
    List<String> toppings = Arrays.asList("sliced pepperoni", "sliced onion", "grated parmesan cheese");
    public PepperoniPizza(){
        setName("Pepperoni");
        setDough("Crust");
        setSauce("Marinara");
        setToppings(toppings);
    }
}
