package com.designpattern.pizzatypes.clam;

import java.util.Arrays;
import java.util.List;

public class CairoClamPizza extends ClamPizza {
    public CairoClamPizza() {
        super(); // Call the constructor of the parent class
        // Customize toppings for CairoClamPizza
        List<String> cairoToppings = Arrays.asList("Cairo Clam Topping 1", "Cairo Clam Topping 2");
        setToppings(cairoToppings);
    }
}