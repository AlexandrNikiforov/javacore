package main.java.com.chapter10exceptions;

public class SuperSubCatch {


    public static void main(String[] args) {

        /* This code doesn't compile as when you use multiple catch statements,
        exception subclasses must come before any of their superclasses.
        Arithmetic exception is  a subclass of Exception,
        the first catch statement will handle all Exception-based errors,
        including ArithmeticException.
        The second catch statement is never reached.

        try {
            int a = 0;
            int b = 42 / a;
        } catch (Exception e) {
            System.out.println("Generic Exception catch.");
        }
        catch (ArithmeticException e) { //ERROR - unreachable
            System.out.println("This is never reached.");
        }
        */

//          This code compile
        try {
            int a = 0;
            int b = 42 / a;
        } catch (ArithmeticException e) { //ERROR - unreachable
            System.out.println("The divisor is 0");
        } catch (Exception e) {
            System.out.println("Generic Exception catch.");
        }
    }
}
