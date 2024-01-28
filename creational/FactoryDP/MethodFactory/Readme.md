# Pizza Store Design Pattern Project

## Overview

This project implements a pizza store system using the Factory Method design pattern. The system includes abstract pizza classes, concrete pizza types, and pizza stores for different regions.

## Project Structure

The project is organized into the following packages:

- **com.designpattern**: Main package for the project.
    - `Main`: Contains the main method to demonstrate the usage of pizza stores and pizzas.

- **com.designpattern.pizzamodel**: Package for the abstract pizza model.
    - `Pizza`: Abstract class representing a generic pizza.

- **com.designpattern.pizzatypes.cheese**: Package for concrete cheese pizza types.
    - `CheesePizza`: Abstract class representing a generic cheese pizza.

- **com.designpattern.pizzastores**: Package for pizza store classes following the Factory Method pattern.
    - `PizzaStore`: Abstract class representing a pizza store.
    - `AlexPizzaStore`: Concrete class representing a pizza store in the Alex region.

## Class Documentation

### `Pizza` Class

- **Purpose**: Abstract class representing a generic pizza.
- **Methods**:
    - `prepare()`: Prepare the pizza.
    - `bake()`: Bake the pizza.
    - `cut()`: Cut the pizza.
    - `box()`: Box the pizza.
    - `toString()`: Override to provide a formatted string representation.

### `CheesePizza` Class

- **Purpose**: Abstract class representing a generic cheese pizza.
- **Fields**:
    - `toppings`: Default toppings for a cheese pizza.
- **Constructor**:
    - Initializes the default properties for a cheese pizza.

### `AlexPizzaStore` Class

- **Purpose**: Concrete class representing a pizza store in the Alex region.
- **Methods**:
    - `createPizza(String type)`: Factory method to create a pizza of a specified type.

### `Main` Class

- **Purpose**: Contains the main method to demonstrate the usage of pizza stores and pizzas.
- **Usage**:
    - Creates an instance of `AlexPizzaStore`.
    - Orders a pizza of the "clam" type.
    - Prints the details of the ordered pizza.

## Usage

To run the project, execute the `Main` class. It demonstrates the creation of an AlexPizzaStore and ordering a pizza of the "clam" type.
