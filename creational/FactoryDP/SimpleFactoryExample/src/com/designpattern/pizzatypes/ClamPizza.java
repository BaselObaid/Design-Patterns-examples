package com.designpattern.pizzatypes;

import com.designpattern.Pizza;

import java.util.Arrays;
import java.util.List;
/**
 * ClamPizza Class
 *
 * The ClamPizza class is a concrete subclass of Pizza, representing a pizza with clams and grated parmesan cheese toppings.
 */
public class ClamPizza extends Pizza {
    List<String> toppings = Arrays.asList("Clams", "grated parmesan cheese");
    public ClamPizza(){
        setName("Clam");
        setDough("thin Crust");
        setSauce("white garlic");
        setToppings(toppings);
    }
}
