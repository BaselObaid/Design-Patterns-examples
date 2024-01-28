/**
 * AlexPizzaStore Class
 *
 * This class is a concrete subclass of PizzaStore, representing a pizza store in the Alex region.
 * It follows the Factory Method design pattern to create pizzas based on the specified type.
 * The createPizza method is implemented to instantiate specific types of pizzas for the Alex region.
 */
package com.designpattern.pizzastores;

import com.designpattern.pizzamodel.Pizza;
import com.designpattern.pizzatypes.cheese.AlexCheesePizza;
import com.designpattern.pizzatypes.clam.AlexClamPizza;
import com.designpattern.pizzatypes.pepperoni.AlexPepperoniPizza;
import com.designpattern.pizzatypes.veggie.VeggiePizza;

public class AlexPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {

        switch (type) {
            case "cheese":
                return new AlexCheesePizza();
            case "pepperoni":
                return new AlexPepperoniPizza();
            case "clam":
                return new AlexClamPizza();
            case "veggie":
                return new VeggiePizza();
            default:
                return null;
        }
    }
}
