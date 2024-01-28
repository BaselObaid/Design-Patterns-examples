package com.designpattern.pizzatypes.clam;

import java.util.Arrays;
import java.util.List;

public class AlexClamPizza extends ClamPizza {
    public AlexClamPizza() {
        super(); // Call the constructor of the parent class
        // Customize toppings for AlexClamPizza
        List<String> alexToppings = Arrays.asList("Alex Clam Topping 1", "Alex Clam Topping 2");
        setToppings(alexToppings);
    }
}