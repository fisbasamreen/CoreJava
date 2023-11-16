package src;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsPrograms {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);

        //Find all even numbers
        list.stream().filter(x -> x%2==0).forEach(System.out::println);

        System.out.println(" ");

        //find out all the numbers starting with 1
        list.stream().map(x -> x + "").filter(s -> s.startsWith("1")).forEach(System.out::println);


        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 5, 4, 6, 7, 7, 8);

        //First element
        numbers.stream()
                .findFirst()
                .ifPresent(System.out::println);

        //count of elements
        long count = numbers.stream().count();
        System.out.println("count of elements " + count);

        //Max element
        int max =  numbers.stream()
                    .max(Integer::compareTo).
                    get();
        System.out.println("max " + max);

        //Find all distinct numbers
        List<Integer> distinctNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        for(Integer i : distinctNumbers) {
            System.out.println(i);
        }

        //Find all duplicate numbers
        Set<Integer> set = new HashSet();
        System.out.println("Printing all duplicates");
        numbers.stream().filter( x -> !set.add(x)).forEach(System.out::println);

        List<Integer> duplicates = numbers.stream()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());


        for(Integer i : duplicates) {
            System.out.println(i);
        }

        //First repeated character
        String str = "Java articles are Awesome";
        Character result = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() >1)
                .map(entry -> entry.getKey())
                .findFirst()
                .get();

        System.out.println("Repeated character " + result);


        //First non repeating character
        Character res = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(entry -> entry.getKey())
                .findFirst()
                .get();

        System.out.println("Non Repeated character " + result);
    }

}
