package main.java.com.chapter10exceptions.initiolizers;

public class ClassWithInitiolizer {

    private int a;
    private int b;
    private int c;
    public static final int VARIABLE_TWO = 1;

    {
        System.out.println("NonStatic initializer is running");
        if (ClassWithStaticInitializer.VARIABLE == 0) {
            System.out.println("VARIABLE = 0");
            throw new IllegalArgumentException();
        }
    }

    public ClassWithInitiolizer(int a, int b) throws IllegalArgumentException   {
        System.out.println("Constructor is running");
        this.a = a;
        this.b = b;
    }

    public ClassWithInitiolizer() throws IllegalArgumentException {

    }


}
