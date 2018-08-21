package ua.jvdevpro.smlnk;

public class Box<T> {

    // T stands for "Type"
    private T t;

    public Box() {
        super();
    }

    public T getT() {
        return t;
    }

    public void add(T t) {
        this.t = t;
    }
}
