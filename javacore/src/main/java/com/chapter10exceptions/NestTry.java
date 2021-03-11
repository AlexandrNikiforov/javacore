package main.java.com.chapter10exceptions;

public class NestTry {
    public static void main(String[] args) {
        try {
            int a = args.length;

            /* If no command-line args are present, the following statement will
               generate a divide-by-zero exception
             */
            int b = 42 / a;

            try { //nested try block
                /* If one of command-line arg is used,
                   then a divide-by-zero exception
                   will be generated by the following code.
                 */
                if (a == 1) {
                    a = a / (a - a); //division by zero
                }
                    /* if two command-line args are used,
                      then generate out-of-bounds exception. */
                    if (a == 2) {
                        int c[] = {1};
                        c[42] = 99; //generate an out-of-bounds exception
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                  System.out.println("Array index out-of-bounds: " + e);
                }
        } catch (ArithmeticException e) {
            System.out.println("Divide by 0: " + e);
        }
    }
}
