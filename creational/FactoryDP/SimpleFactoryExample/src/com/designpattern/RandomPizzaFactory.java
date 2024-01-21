package com.designpattern;

import com.designpattern.pizzatypes.CheesePizza;
import com.designpattern.pizzatypes.ClamPizza;
import com.designpattern.pizzatypes.PepperoniPizza;

import java.util.Random;

/**
 * RandomPizzaFactory Class
 *
 * The RandomPizzaFactory class implements the PizzaFactory interface and is responsible for creating pizzas randomly.
 */
public class RandomPizzaFactory implements PizzaFactory {

    /**
     * Create a pizza based on the specified types.
     *
     * @param types: Optional pizza types that may influence the creation.
     * @return Pizza: The randomly created pizza.
     */
    @Override
    public Pizza createPizza(String... types) {
        Pizza pizza;

        if (types.length == 0) {
            pizza = createRandomPizza();
        } else {
            // If types are specified, create a default CheesePizza
            pizza = new CheesePizza();
        }

        return pizza;
    }

    /**
     * Create a random pizza based on a randomly generated number.
     *
     * @return Pizza: The randomly created pizza.
     */
    private Pizza createRandomPizza() {
        Random random = new Random();
        int ran = random.nextInt(11);

        switch (ran) {
            case 0:
                return new PepperoniPizza();
            case 1:
                return new ClamPizza();
            default:
                return new CheesePizza();
        }
    }
}
