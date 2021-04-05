package main.java.com.chapter18.collections.map;

import java.util.HashMap;
import java.util.Map;


public class BaeldungMergingTwoMaps {

    private static Map<String, Employee> map1 = new HashMap<>();
    private static Map<String, Employee> map2 = new HashMap<>();

    public static void main(String[] args) {

        Employee employee1 = new Employee(1L, "Henry");
        map1.put(employee1.getName(), employee1);
        Employee employee2 = new Employee(22L, "Annie");
        map1.put(employee2.getName(), employee2);
        Employee employee3 = new Employee(8L, "John");
        map1.put(employee3.getName(), employee3);

        Employee employee4 = new Employee(2L, "George");
        map2.put(employee4.getName(), employee4);
        Employee employee5 = new Employee(3L, "Henry");
        map2.put(employee5.getName(), employee5);

        /*
        Here is how the merge() function works: If the specified key is not already associated with a value
        or the value is null, it associates the key with the given value.
        Otherwise, it replaces the value with the results of the given remapping function.
        If the result of the remapping function is null, it removes the result.
        First, let's construct a new HashMap by copying all the entries from the map1:
         */

        Map<String, Employee> map3 = new HashMap<>(map1);

        /*Next, let's introduce the merge() function along with merging rule:

        map3.merge(key, value, (v1, v2) -> new Employee(v1.getId(),v2.getName())
        */


    }

}
