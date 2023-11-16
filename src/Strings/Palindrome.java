package src.Strings;

import java.util.Collections;
import java.util.stream.Collectors;

public class Palindrome {
    public static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()) {
            if(Character.isLetterOrDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }

        if(sb.toString().equals(sb.reverse().toString())){
            return true;
        } else {
            return false;
        }

        /*String reverse = "";
        s = s.toLowerCase();
        String formattedString = "";

        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(s.charAt(i))) {
                formattedString += c;
            }
        }

        for(int i=formattedString.length()-1;i>=0;i--) {
            reverse += formattedString.charAt(i);
        }

        if(formattedString.equals(reverse)) {
            return true;
        } else {
            return false;
        } */
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(s + " - palindrome - " + isPalindrome(s));
    }
}
