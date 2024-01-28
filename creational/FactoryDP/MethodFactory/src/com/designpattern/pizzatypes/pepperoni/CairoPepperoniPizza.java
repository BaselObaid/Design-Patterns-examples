package com.designpattern.pizzatypes.pepperoni;

import java.util.Arrays;
import java.util.List;

public class CairoPepperoniPizza extends PepperoniPizza {
    public CairoPepperoniPizza() {
        super(); // Call the constructor of the parent class
        // Customize toppings for CairoPepperoniPizza
        List<String> cairoToppings = Arrays.asList("Cairo Pepperoni Topping 1", "Cairo Pepperoni Topping 2");
        setToppings(cairoToppings);
    }
}