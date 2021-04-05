package main.java.com.chapter14.generics;

// A simple generic class.
// Here, T is a type parameter that
// will be replaced by a real type
// when an object of type Gen is created.
public class NonGen {
    Object ob;

    NonGen(Object o) {
        ob = o;
    }

    Object getOb() {
        return ob;
    }
    void showType() {
        System.out.println("Type of ob is " + ob.getClass().getName());
    }

}
