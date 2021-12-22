package co.unicauca.microkernel.common.entities;

/**
 * Producto
 *
 * @author Libardo, Julio
 */
public class Product {

    private int productId;
    private String name;

    /**
     * Peso del producto, en kilogramos.
     *
     */
    private double weight;
    /**
     * Ancho del producto, en centímetros.
     *
     */
    private double width;
    /**
     * Alto del producto, en centímetros.
     *
     */
    private double height;
    /**
     * Profundidad del producto, en centímetros.
     *
     */
    private double depth;

    public Product() {

    }

    public Product(int productId, String name, double weight, double width, double height, double depth) {
        this.productId = productId;
        this.name = name;
        this.weight = weight;
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }
    
    
    public String __str__(){
       return "Producto: " + name + " Dims(Al, An, Pro): (" 
               + String.valueOf(width) 
               + "," +String.valueOf(height)  
               + "," +String.valueOf(depth)+ ") Peso:"
               + String.valueOf(weight) + "kg ";  
    }
}
