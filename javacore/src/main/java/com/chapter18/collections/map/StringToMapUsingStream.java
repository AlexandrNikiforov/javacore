package main.java.com.chapter18.collections.map;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringToMapUsingStream {

    public static void main(String[] args) {

        String sentence = "Hello world";
        IntStream intStream = sentence.chars();

        Stream<Character> characterStream = sentence.chars()
                .mapToObj(c -> (char) c);

//        Map<Character, Integer> mapOfResults =
//                characterStream.collect(Collectors.toMap(Character::getName,() -> characterStream.count() ));

//        Map<Character, Integer> mapOfResults = sentence.chars()
//                                                     .mapToObj(c -> (char) c)
//                                                     .collect(Collectors.toMap(Character::getName, Collectors.counting()));

//        System.out.println(mapOfResults);




    }
}
