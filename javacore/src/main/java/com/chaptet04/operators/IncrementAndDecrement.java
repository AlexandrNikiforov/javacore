package main.java.com.chaptet04.operators;

public class IncrementAndDecrement {

    public static void main(String[] args) {
        int a = 40;
        int b = a++;
        System.out.println("int a = 40; int b = a++ = " + b);
        System.out.println("---");
        int x = 40;
        int y = ++x;
        System.out.println("int x = 40; int y = ++x = " + y);
        System.out.println("---");

        int[] xyz = {0,1,2,3,4,5};
        int i = 1;
        System.out.println("int i = 1; xyz[i] = " + xyz[i]);
        System.out.println("int i = 1; xyz[++i] = " + xyz[++i] + "; i = " + i);
        i = 1;

        System.out.println("int i = 1; xyz[i++] = " + xyz[i++] + "; i = " + i);
        i = 1;

        System.out.println("int i = 1; xyz[i--] = " + xyz[i--] + "; i = " + i);
        i = 1;

        System.out.println("int i = 1; xyz[--i] = " + xyz[--i] + "; i = " + i);

    }
}
