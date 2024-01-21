package com.designpattern.pizzatypes;

import com.designpattern.Pizza;

import java.util.Arrays;
import java.util.List;
/**
 * CheesePizza Class
 *
 * The CheesePizza class is a concrete subclass of Pizza, representing a pizza with fresh mozzarella and parmesan cheese toppings.
 */
public class CheesePizza extends Pizza {
    List<String> toppings = Arrays.asList("fresh mozzarella", " parmesan cheese");
    public CheesePizza(){
        setName("Cheese");
        setDough("Regular Crust");
        setSauce("Marinara");
        setToppings(toppings);
    }
}
