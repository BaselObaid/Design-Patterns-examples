package firstsolution;

/**
 * Represents a robot with various properties. Uses constructor chaining for construction.
 * it solve the problem of code repetition and the code will be more resuable
 * but we still have a problem
 * what if we have more feilds and we make alot of constructors each constructor call another ?!
 */

public class Robot{
    private int id;
    private static int idCounter;
    private String type;
    private int guarantee;
    private double price;
    private boolean headShape;
    private boolean bodyShape;
    private boolean legsShape;

    // to create a robot by only his type
    public Robot(String type){
        this.id = idCounter++;
        this.type = type.toLowerCase();
        switch (type) {
            case "hbl":
                this.headShape = true;
                this.bodyShape = true;
                this.legsShape = true;
                this.price = 3000;
                this.guarantee = 3;
            break;
            case "bl":
                this.headShape = false;
                this.bodyShape = true;
                this.legsShape = true;
                this.price = 2000;
                this.guarantee = 2;
            break;
            case "hb":
                this.headShape = true;
                this.bodyShape = true;
                this.legsShape = false;
                this.price = 2000;
                this.guarantee = 2;
            break;
            case "b":
                this.headShape = false;
                this.bodyShape = true;
                this.legsShape = false;
                this.price = 1000;
                this.guarantee = 1;
            break;       
            default:
                this.headShape = false;
                this.bodyShape = true;
                this.legsShape = false;
                this.price = 1000;
                this.guarantee = 1;
            break;
        }
    }

    // to create robot by type and price
    public Robot(String type, double price){
        this(type);
        this.price = price;
    }

    // to create robot by type, price and guarantee
    public Robot(String type, double price, int guarantee){
        this(type, price);
        this.guarantee = guarantee;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder(
            "[id: " + id + 
        ", type: " + type + 
        ", price: " + price+ 
        ", guarantee: " + guarantee + 
        ", headShape: " + headShape +
        ", bodyShape: " + bodyShape +
        ", legsShape: " + legsShape + "]"
        );
        return sb.toString();
    }
 
}