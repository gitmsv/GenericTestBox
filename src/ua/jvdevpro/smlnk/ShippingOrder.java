package ua.jvdevpro.smlnk;

public class ShippingOrder <K,V>{

    /**
     *
     * @param <K>  order ID goes here
     * @param <V>  typically you put boxes with stuff here, but...
     */

    // The business logic to ship goods goes here
    private K key;
    private V value;

    public ShippingOrder (K key, V value){
        this.key = key;
        this.value = value;
    }


}
