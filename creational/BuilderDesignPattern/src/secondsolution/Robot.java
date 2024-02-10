package secondsolution;

/**
 * Represents a robot with various properties. Uses special setter methods for construction.
 * it solve the problem if we have a lot of construactors for these fields
 * becuase each setter create a part of the complex object and you have a control on how to create it
 * but we have a problem
 * i can't force who will use this setters to use all of them 
 * for example guarantee setter
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

    public Robot(){
        this.id = idCounter++;
    }

    public Robot setType(String type){
        this.type = type;
        setDefault();
        return this;
    }

    // if you pass a price value you will update the defulat price
    public Robot setPrice(double... price){
        if(price.length > 0)
            this.price = price[0];    
        return this;
    }

    // set the guarantee value
    public Robot setGuarantee(int guarantee){
        this.guarantee = guarantee;
        return this;
    }

    private void setDefault(){
        switch (type) {
            case "hbl":
                this.headShape = true;
                this.bodyShape = true;
                this.legsShape = true;
                this.price = 3000;
            break;
            case "bl":
                this.headShape = false;
                this.bodyShape = true;
                this.legsShape = true;
                this.price = 2000;
            break;
            case "hb":
                this.headShape = true;
                this.bodyShape = true;
                this.legsShape = false;
                this.price = 2000;
            break;
            case "b":
                this.headShape = false;
                this.bodyShape = true;
                this.legsShape = false;
                this.price = 1000;
            break;       
            default:
                this.headShape = false;
                this.bodyShape = true;
                this.legsShape = false;
                this.price = 1000;
            break;
        }
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
