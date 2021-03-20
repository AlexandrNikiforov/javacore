package main.java.com.chapter10exceptions.initiolizers;

public class ClassWithStaticInitializer {

    public static final int VARIABLE = 0;
    private int a;
    private int b;

    static {
        System.out.println("Static initializer is running");
        if (ClassWithInitiolizer.VARIABLE_TWO == 0) {
            System.out.println("VARIABLE = 0");
            throw new IllegalArgumentException();
        }
    }

    public ClassWithStaticInitializer(int a, int b) throws IllegalArgumentException   {
        System.out.println("Constructor is running");
        this.a = a;
        this.b = b;
    }

    public ClassWithStaticInitializer() throws IllegalArgumentException {

    }

}
