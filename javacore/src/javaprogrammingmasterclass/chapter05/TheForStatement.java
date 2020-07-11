package javaprogrammingmasterclass.chapter05;

public class TheForStatement {

    public static void main(String[] args) {

        for (double interestRate = 2; interestRate <6; interestRate++) {
            System.out.println("10.000 at " + interestRate + "% interest = " + calculateInterest(10000.0,interestRate));

        }

    }

public static double calculateInterest (double amount, double interestRate) {
        return (amount * (interestRate / 100));

}

}
