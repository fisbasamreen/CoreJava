package src;

import java.util.Arrays;
import java.util.List;

public class StreamPrograms2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);

        //print all even numbers
        list.stream().filter(x-> x%2==0).forEach(System.out::println);
    }
}
