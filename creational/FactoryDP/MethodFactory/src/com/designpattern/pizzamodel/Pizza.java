package com.designpattern.pizzamodel;


import java.util.ArrayList;
import java.util.List;
    /**
     * Pizza Class
     *
     * The abstract class representing a generic pizza. Concrete pizza types will extend this class.
     */
    public abstract class Pizza {

        private String name;
        private String dough;
        private String sauce;
        List<String> toppings = new ArrayList<>();

        public String getName(){
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDough() {
            return dough;
        }

        public void setDough(String dough) {
            this.dough = dough;
        }

        public String getSauce() {
            return sauce;
        }

        public void setSauce(String sauce) {
            this.sauce = sauce;
        }

        public List<String> getToppings() {
            return toppings;
        }

        public void setToppings(List<String> toppings) {
            this.toppings = toppings;
        }



        public void prepare(){
            System.out.println("Preparing: " + name);
        }

        public void bake(){
            System.out.println("Baking: " + name);
        }

        public void cut(){
            System.out.println("Cutting: " + name);
        }

        public void box(){
            System.out.println("Boxing: " + name);
        }

        /**
         * Override the toString() method to provide a formatted string representation of the pizza.
         *
         * @return String: The formatted string representation of the pizza.
         */
        @Override
        public String toString() {
            StringBuilder display = new StringBuilder();
            display.append("***** " + name + "Pizza *****\n");
            display.append("dough type: " + dough + "\n");
            display.append("sauce type: " + sauce + "\n");
            display.append("toppings:\n[\n ");
            toppings.stream().forEach((topping) -> {
                display.append(topping + "\n");
            });
            display.append("]");
            return display.toString();
        }


}
