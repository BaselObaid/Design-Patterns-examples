package com.designpattern;

import java.util.Random;
/**
 * PizzaStore Class
 *
 * The PizzaStore class is responsible for handling pizza orders using the Simple Factory design pattern.
 */
public class PizzaStore {

    private PizzaFactory pizzaFactory;

    /**
     * Order a pizza of the specified type.
     *
     * @param typeName: The type of pizza to be ordered.
     * @return Pizza: The ordered pizza.
     */
    Pizza orderPizza(String typeName) {
        String type = typeName.toLowerCase();
        pizzaFactory = new SimplePizzaFactory();
        return pizzaFactory.createPizza(type);
    }

    /**
     * Get a random pizza using the Random Pizza Factory.
     *
     * @return Pizza: A randomly selected pizza.
     */
    Pizza getRandomPizza() {
        pizzaFactory = new RandomPizzaFactory();
        return pizzaFactory.createPizza();
    }

    /**
     * Simulate winning a pizza based on a predefined condition.
     *
     * @param num: The predefined number for winning.
     * @param pizzaName: The type of pizza to be ordered if the condition is met.
     * @return Pizza: The won pizza, or null if the condition is not met.
     */
    Pizza winPizza(int num, String pizzaName) {
        int ran = createRandomNumber();
        Pizza pizza = null;
        if (ran == num) {
            pizza = orderPizza(pizzaName);
        }
        return pizza;
    }

    /**
     * Generate a random number between 0 and 10 (inclusive).
     *
     * @return int: The randomly generated number.
     */
    private int createRandomNumber() {
        Random random = new Random();
        return random.nextInt(11);
    }
}
