package main.java.com.chapter3.datatypesandarrays;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Arrays;

public class ArraysExample {

    public static void main(String[] args) {
        int [] integerList = new int[5];
        System.out.println("integerList's length :" + integerList.length);
        Arrays.fill(integerList, 0, 5, 1);
        System.out.println("Content of integerList: ");
        Arrays.stream(integerList).forEach(System.out::println);


    }


}
