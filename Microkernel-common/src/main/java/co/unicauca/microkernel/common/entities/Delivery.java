package co.unicauca.microkernel.common.entities;

/**
 * Envio
 * @author Libardo, Julio
 */
public class Delivery {

    private Product product;
    private double distance;
    /**
     * CÃ³digo del paÃ­s donde serÃ¡ entregado el producto.
     * */
    private String countryCode;
    private String direccion; 
    private String ciudad; 
    
    private double costo;  

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
    
    public Delivery(Product product, double distance, String countryCode) {
        this.product = product;
        this.distance = distance;
        this.countryCode = countryCode;
    }

    public Delivery(Product product, double distance, String countryCode, String ciudad, String direccion) {
        this.product = product;
        this.distance = distance;
        this.countryCode = countryCode;
        this.ciudad = ciudad; 
        this.direccion = direccion; 
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    public String __str__(){
        return product.__str__() + " " 
                + "Datos-> CódigoPaís: " + countryCode + " "
                + "Direccion: " + direccion + " "
                + "Ciudad: " + ciudad + " "
                + "dist:" + String.valueOf(distance) + " Km "
                + "Costo: " + String.valueOf(costo)  + "$";  
    }
    
}
