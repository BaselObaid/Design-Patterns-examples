package com.designpattern;

/**
 * Pizza Factory Interface
 *
 * This interface defines the contract for creating instances of the Pizza class.
 * Implementing classes are responsible for creating specific types of pizzas based on the provided parameters.
 */
public interface PizzaFactory {

    /**
     * Create Pizza Method
     *
     * Creates a Pizza object based on the specified pizza type(s).
     *
     * @param types (variable number of strings): A list of pizza types that may influence the creation of the pizza.
     *             The number and meaning of these parameters depend on the specific implementation.
     * @return Pizza: The created pizza object.
     */
    Pizza createPizza(String... types);
}
