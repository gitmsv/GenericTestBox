package ua.jvdevpro.smlnk;

public class Main {

    public static void main(String[] args) {

        Box<Integer> integerBox = new Box<>();
        integerBox.add(new Integer(7));

        Integer someInt = integerBox.getT(); // no cast!
        System.out.println(someInt);
    }
}
