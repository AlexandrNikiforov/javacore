package main.java.com.chapter18.collections.map;

import java.util.HashMap;
import java.util.Map;

public class UsingMapMerge {

    public static void main(String[] args) {

        Map <String, String> books = new HashMap<>();
        books.put("Война и мир", "Лев Толстой");
        books.put("Преступление и наказание", "Федор Достоевский");
        books.put("Философия Java", "Брюс Эккель");
        books.put("Братья Карамазовы", "Федор Достоевский");
        books.put("Властелин Колец", "Джон Толкин");

        //Map.merge(K key, V value, BiFunction<? super V, ? super V, ? extends V> remappingFunction)

        books.merge("Философия Java", "Брюс Эккель", (a, b) -> b +  " и кто-то там еще");
        books.forEach((a,b) -> System.out.println("Название:" + a + ". Автор: " + b));

    }

}
