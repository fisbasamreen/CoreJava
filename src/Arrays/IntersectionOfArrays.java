package src.Arrays;

import java.util.Arrays;

public class IntersectionOfArrays {
    public static void main(String[] args) {
        int[] arr1 = new int[] {1,2,3,4};
        int[] arr2 = new int[] {3,4,5};

        Arrays.stream(arr1).filter(num1 ->
        Arrays.stream(arr2).anyMatch(num2 -> num1 == num2)).forEach(System.out::println);


    }
}
