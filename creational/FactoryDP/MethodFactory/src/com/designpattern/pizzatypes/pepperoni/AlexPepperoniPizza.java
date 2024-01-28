package com.designpattern.pizzatypes.pepperoni;


import java.util.Arrays;
import java.util.List;

public class AlexPepperoniPizza extends PepperoniPizza {
    public AlexPepperoniPizza() {
        super(); // Call the constructor of the parent class
        // Customize toppings for AlexPepperoniPizza
        List<String> alexToppings = Arrays.asList("Sliced pepperoni", "Sliced onion", "Grated parmesan cheese");
        setToppings(alexToppings);
    }
}