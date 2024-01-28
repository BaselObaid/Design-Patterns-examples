/**
 * PizzaStore Class
 *
 * This abstract class represents a pizza store that follows the Factory Method design pattern.
 * It defines a common interface for creating pizzas but delegates the actual creation to subclasses.
 * Subclasses (e.g., AlexPizzaStore, CairoPizzaStore) implement the createPizza method to instantiate
 * specific types of pizzas based on the region or other criteria.
 */
package com.designpattern.pizzastores;

import com.designpattern.pizzamodel.Pizza;

import java.util.Random;

public abstract class PizzaStore {

    /**
     * Order Pizza Method
     *
     * This method is responsible for ordering a pizza of a specified type.
     * It delegates the creation of the pizza to the createPizza method, which is implemented by subclasses.
     *
     * @param typeName String: The type of pizza to be ordered.
     * @return Pizza: The ordered pizza.
     */
    public Pizza orderPizza(String typeName) {
        Pizza pizza = createPizza(typeName);
        return pizza;
    }

    /**
     * Create Pizza Method (Factory Method)
     *
     * This abstract method is responsible for creating a pizza of a specified type.
     * Subclasses must implement this method to define the specific pizza creation logic.
     *
     * @param type String: The type of pizza to be created.
     * @return Pizza: The created pizza.
     */
    protected abstract Pizza createPizza(String type);

    /**
     * Win Pizza Method
     *
     * This method simulates a scenario where a pizza is won based on a random number.
     * It generates a random number between 0 and 10 (inclusive) and compares it to a specified number.
     * If the numbers match, the pizza with the given name is ordered.
     *
     * @param num int: The specified number for comparison.
     * @param pizzaName String: The name of the pizza to be ordered if the numbers match.
     * @return Pizza: The ordered pizza if the random number matches the specified number; otherwise, null.
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
     * Create Random Number Method
     *
     * This private method generates a random number between 0 and 10 (inclusive).
     *
     * @return int: The randomly generated number.
     */
    private int createRandomNumber() {
        Random random = new Random();
        return random.nextInt(11);
    }
}
