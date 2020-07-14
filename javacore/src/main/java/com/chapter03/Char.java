package main.java.com.chapter03;


public class Char {

    public static void main(String[] args) {

        LearnHowToUseChar();




    }

    public static void  LearnHowToUseChar () {

        char testCharVariable = 'A';
        char testCharVariable2 = '\u1F10';
        char testCharVariable3 = '\'';

        for (int i = 1; i < 30; i++) {
            System.out.println(testCharVariable + " " + testCharVariable2 + " " + testCharVariable3);
            testCharVariable ++;
            testCharVariable2++;
            testCharVariable3++;
        }


    }





}
