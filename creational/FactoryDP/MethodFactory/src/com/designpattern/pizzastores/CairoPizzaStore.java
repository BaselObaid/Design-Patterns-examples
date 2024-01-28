/**
 * CairoPizzaStore Class
 *
 * This class is a concrete subclass of PizzaStore, representing a pizza store in the Cairo region.
 * It follows the Factory Method design pattern to create pizzas based on the specified type.
 * The createPizza method is implemented to instantiate specific types of pizzas for the Cairo region.
 */
package com.designpattern.pizzastores;

import com.designpattern.pizzamodel.Pizza;
import com.designpattern.pizzatypes.cheese.CairoCheesePizza;
import com.designpattern.pizzatypes.clam.CairoClamPizza;
import com.designpattern.pizzatypes.pepperoni.CairoPepperoniPizza;
import com.designpattern.pizzatypes.veggie.VeggiePizza;

public class CairoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {

        switch (type) {
            case "cheese":
                return new CairoCheesePizza();
            case "pepperoni":
                return new CairoPepperoniPizza();
            case "clam":
                return new CairoClamPizza();
            case "veggie":
                return new VeggiePizza();
            default:
                return null;
        }
    }
}
