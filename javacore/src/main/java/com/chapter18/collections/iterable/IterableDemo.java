package main.java.com.chapter18.collections.iterable;

import java.util.*;

public class IterableDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        int index = 0;
        Iterator<Integer> iterator = arrayList.iterator();
        while(iterator.hasNext()) {
            System.out.println("iterator.next(): " + iterator.next());

            if (index == 0) {
                iterator.remove();
            }
            index++;
        }

        for(int x: arrayList) {
            System.out.println(x);
//            if(x == 1) {
//                list.remove(1);
//            }
        }



    }
}
