package problem;

/**
 * this is a robot class
 * has 8 feilds and 3 constructors
 * each constructor create a robot depend on the paramters it takes
 * the problems with this definition are :
 * 1- we have alot of repetition in each constructor
 * 2- if the fields is more than we have (ex. 20 or 30) to create the robot
 * we will write alot of constructors and we should remember the parameters 
 */

public class Robot {

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
        this.id = idCounter++;
        this.type = type.toLowerCase();
        switch (type) {
            case "hbl":
                this.headShape = true;
                this.bodyShape = true;
                this.legsShape = true;
                this.guarantee = 3;
            break;
            case "bl":
                this.headShape = false;
                this.bodyShape = true;
                this.legsShape = true;
                this.guarantee = 2;
            break;
            case "hb":
                this.headShape = true;
                this.bodyShape = true;
                this.legsShape = false;
                this.guarantee = 2;
            break;
            case "b":
                this.headShape = false;
                this.bodyShape = true;
                this.legsShape = false;
                this.guarantee = 1;
            break;       
            default:
                this.headShape = false;
                this.bodyShape = true;
                this.legsShape = false;
                this.guarantee = 1;
            break;
        }
        this.price = price;
    }

    // to create robot by type, price and guarantee
    public Robot(String type, double price, int guarantee){
        this.id = idCounter++;
        this.type = type.toLowerCase();
        switch (type) {
            case "hbl":
                this.headShape = true;
                this.bodyShape = true;
                this.legsShape = true;
            break;
            case "bl":
                this.headShape = false;
                this.bodyShape = true;
                this.legsShape = true;
            break;
            case "hb":
                this.headShape = true;
                this.bodyShape = true;
                this.legsShape = false;
            break;
            case "b":
                this.headShape = false;
                this.bodyShape = true;
                this.legsShape = false;
            break;       
            default:
                this.headShape = false;
                this.bodyShape = true;
                this.legsShape = false;
            break;
        }
        this.price = price;
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