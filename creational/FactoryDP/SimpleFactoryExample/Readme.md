# Pizza Store Main Program

This Java program serves as an example of a pizza ordering system using the Simple Factory design pattern. The code is organized into a `Main` class, which demonstrates various scenarios such as placing a simple order, entering to win a pizza, and receiving a randomly selected pizza.

## Usage Examples

### 1. Simple Order

```java
// simple order
PizzaStore pizzaStore = new PizzaStore();
Pizza pizza = pizzaStore.orderPizza("Veggie");
if(pizza == null){
    System.out.println("wrong order");
}
else{
    System.out.println(pizza);
}
```
This section demonstrates a straightforward pizza order using the Simple Factory pattern. A Veggie pizza is requested from the PizzaStore, and if the order is successful, it prints the details of the ordered pizza. Otherwise, it notifies the user of a "wrong order."
### 2. Enter to Win
```java
PizzaStore pizzaStore1 = new PizzaStore();
Pizza pizza1 = pizzaStore1.winPizza(2, "cheese");
if(pizza1 == null){
System.out.println("bad luck");
}
else{
System.out.println(pizza1);
}
```
Here, the program simulates winning a pizza based on a predefined condition, showcasing the usage of the Simple Factory pattern. If the condition is met (in this case, a random number equals 2), it prints the details of the won pizza; otherwise, it informs the user of "bad luck."
### 3. You Can't Choose! We Will Do That for You
```java
PizzaStore pizzaStore2 = new PizzaStore();
Pizza pizza2 = pizzaStore2.getRandomPizza();
System.out.println(pizza2);
```
In this scenario, the program demonstrates the randomness of pizza selection using the Simple Factory pattern. The user is not allowed to choose a specific pizza type, and the PizzaStore provides a random pizza. It then prints the details of the randomly selected pizza.

