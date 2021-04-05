package main.java.com.chapter10exceptions.nullpointerexception;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class NullPointerExceprion {

    public static void main(String[] args) {

        Map<String, Integer> mapExample = new LinkedHashMap<>();
        System.out.println(mapExample);
        Integer value = null;
        System.out.println(value); //works

        //doesn't work
        //value = value + 1;

    }


}
