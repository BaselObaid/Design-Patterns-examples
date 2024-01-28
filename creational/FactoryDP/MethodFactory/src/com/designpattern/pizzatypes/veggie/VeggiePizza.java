package com.designpattern.pizzatypes.veggie;

import com.designpattern.pizzamodel.Pizza;

import java.util.Arrays;
import java.util.List;
/**
 * VeggiePizza Class
 *
 * The VeggiePizza class is a concrete subclass of Pizza, representing a pizza with shredded mozzarella, grated parmesan cheese, diced onion, sliced mushrooms, sliced red pepper, and sliced black olives toppings.
 */
public class VeggiePizza extends Pizza {
    List<String> toppings = Arrays.asList("shredded mozzarella",
            "grated parmesan cheese",
            "diced onion",
            "sliced mushrooms",
            "sliced red pepper",
            "sliced black olives");

    public VeggiePizza(){
        setName("vegetables");
        setDough("Crust");
        setSauce("Mariana");
        setToppings(toppings);
    }
}
