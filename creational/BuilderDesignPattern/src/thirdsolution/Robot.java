package thirdsolution;
/**
 * Represents a robot with various properties. Utilizes a Builder pattern for construction.
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

    public Robot(String type, 
    int guarantee, 
    double price, 
    boolean headShape, 
    boolean bodyShape, 
    boolean legsShape){
        this.id = idCounter++;
        this.type = type;
        this.guarantee = guarantee;
        this.price = price;
        this.headShape = headShape;
        this.bodyShape = bodyShape;
        this.legsShape = legsShape;
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
