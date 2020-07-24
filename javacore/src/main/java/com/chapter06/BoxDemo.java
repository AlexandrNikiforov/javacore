package main.java.com.chapter06;

import java.util.Scanner;

class Box {

    double width;
    double height;
    double depth;

    //вывести объем параллелепипеда
    double volume() {
       return width * height * depth;
    }
       //установить размеры параллелепипеда
        void setDim (double w, double h, double d) {
            width = w;
            height = h;
            depth = d;


    }

}


class BoxDemo {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Box mybox = new Box();
        double vol;
        System.out.println("Type box width: ");
        mybox.width = scanner.nextInt();
        System.out.println("Type box height: ");
        mybox.height = scanner.nextInt();;
        System.out.println("Type box depth: ");
        mybox.depth = scanner.nextInt();;

        //Calculate box volume

        vol = mybox.width * mybox.height * mybox.depth;
        System.out.println("The volume of the box is: " + vol);



    }






}