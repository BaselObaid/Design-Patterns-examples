package com.designpattern.pizzatypes.cheese;

import java.util.Arrays;
import java.util.List;

public class AlexCheesePizza extends CheesePizza {
    public AlexCheesePizza() {
        super();
        // Customize toppings for AlexCheesePizza
        List<String> alexToppings = Arrays.asList("cheddar cheese", "bacon", "mushrooms");
        setToppings(alexToppings);
    }
}