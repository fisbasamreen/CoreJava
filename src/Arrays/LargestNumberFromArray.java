package src.Arrays;

import java.util.Arrays;

public class LargestNumberFromArray {
    public static String largestNumber(String[] arr) {
        // Custom comparator for sorting
        // Arrays.sort(strNums, (a, b) -> (b + a).compareTo(a + b));

        Arrays.sort(arr, (num1,num2) -> (num2+num1).compareTo(num1+num2));
        StringBuilder str= new StringBuilder();
        for(String s: arr) {
            str.append(s);
        }

        return str.toString();
    }

    public static void main(String[] args) {
        String arr[] = {"3","30","34","5","9"};
        System.out.println("Largest number " + largestNumber(arr));
    }
}
