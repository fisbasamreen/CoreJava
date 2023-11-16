package src.Strings;

import java.util.Arrays;
import java.util.Collections;

public class ReverseWordsInString {
    public static void reverseWords(String str) {
       String[] words = str.split(" ");
       StringBuilder reverse  = new StringBuilder();

       for(int i=words.length-1;i>=0;i--) {
           reverse.append(words[i]);
           if(i>0) {
               reverse.append(" ");
           }
       }

        System.out.println(reverse);

    }

    public static void main(String[] args) {
        String str = "the sky is blue";
        reverseWords(str);
    }
}
