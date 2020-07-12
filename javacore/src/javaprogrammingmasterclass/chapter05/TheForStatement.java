package javaprogrammingmasterclass.chapter05;

public class TheForStatement {

    public static void main(String[] args) {
        System.out.println("----Calculation with rate from 2 to 9%----");

        for (double i = 2; i <10; i++) {
            System.out.println("10.000 at " + i + "% interest = " + String.format("%.2f",(calculateInterest(10000.0,i))));

        }

        System.out.println("----Calculation with rate from 8 to 2%----");

        for (double i = 8; i >= 2; i--) {
            System.out.println("10.000 at " + i + "% interest = " + String.format("%.2f",(calculateInterest(10000.0,i))));

        }
        System.out.println("----Testing isPrime method-----");
        System.out.println(isPrime(11));
        System.out.println("----PrintPrimeNumber method test----");
        PrintPrimeNumbers2 ();

        System.out.println("----Test my solution --- ");
        PrintPrimeNumbers ();



    }

    public static boolean isPrime(int n) {

        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

 /* Create a for statement using any range of numbers.
 Determine if the number is a prime number.
 If it is a prime number print it out and increment
 a count of the number of prime number found.
 If that count is 3 exit the for loop.
 Hint: use the break; statement to exit
  */



    //This is my code


    public static void PrintPrimeNumbers () {
        int numberOfPrimeNumbers = 0;
        for (int i=10; i<20; i++) {
            boolean isItPrime = isPrime(i);

            if (isItPrime) {
                System.out.println(i + " is a prime number");
                numberOfPrimeNumbers ++;
            }
            //System.out.println("numberOfPrimeNumbers = " + numberOfPrimeNumbers);
            if (numberOfPrimeNumbers == 3)
                break;


        }

    }




    //This is the correct solution from the masterclass

    public static void PrintPrimeNumbers2 () {
        int count = 0;
        for (int i = 10; i < 20; i++) {
            if (isPrime(i)) {
                System.out.println("Number " + i + " is a prime number");
                count++;
                if (count == 3) {
                    break;
                }
            }

        }



    }






public static double calculateInterest (double amount, double interestRate) {
        return (amount * (interestRate / 100));

}

}
