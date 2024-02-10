package thirdsolution;

/**
 * The RobotBuilder class facilitates the construction of Robot objects using the Builder pattern.
 * It allows users to create Robot instances with various properties without the need to invoke
 * all setter methods, while enforcing mandatory property settings.
 */
public class RobotBuilder {

    private String type;
    private int guarantee;
    private double price;
    private boolean headShape;
    private boolean bodyShape;
    private boolean legsShape;

    public RobotBuilder setType(String type){
        this.type = type;
        setDefault();
        return this;
    }

    // if you pass a price value you will update the defulat price
    public RobotBuilder setPrice(double... price){
        if(price.length > 0)
            this.price = price[0];    
        return this;
    }

    // set the guarantee value
    public RobotBuilder setGuarantee(int guarantee){
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
   
    public Robot build(){
        if (type == null) {
            throw new IllegalStateException("Robot type must be set.");
        }
        if (guarantee <= 0) {
            throw new IllegalStateException("Guarantee must be a positive value.");
        }
        return new Robot(type, guarantee, price, headShape, bodyShape, legsShape);
    }
}