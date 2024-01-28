package com.designpattern.pizzatypes.cheese;

import java.util.Arrays;
import java.util.List;

public class CairoCheesePizza extends CheesePizza {
    public CairoCheesePizza() {
        super();
        // Customize toppings for CairoCheesePizza
        List<String> cairoToppings = Arrays.asList("feta cheese", "olives", "sun-dried tomatoes");
        setToppings(cairoToppings);
    }
}
