package com.designpattern;

import com.designpattern.pizzatypes.CheesePizza;
import com.designpattern.pizzatypes.ClamPizza;
import com.designpattern.pizzatypes.PepperoniPizza;
import com.designpattern.pizzatypes.VeggiePizza;
/**
 * SimplePizzaFactory Class
 *
 * The SimplePizzaFactory class implements the PizzaFactory interface and is responsible for creating pizzas based on specified types.
 */
public class SimplePizzaFactory implements PizzaFactory {

    /**
     * Create a pizza based on the specified types.
     *
     * @param types: Optional pizza types that may influence the creation.
     * @return Pizza: The created pizza.
     */
    @Override
    public Pizza createPizza(String... types) {
        String type = (types.length != 1) ? "cheese" : types[0];

        switch (type) {
            case "cheese":
                return new CheesePizza();
            case "pepperoni":
                return new PepperoniPizza();
            case "clam":
                return new ClamPizza();
            case "veggie":
                return new VeggiePizza();
            default:
                return null;
        }
    }
}
