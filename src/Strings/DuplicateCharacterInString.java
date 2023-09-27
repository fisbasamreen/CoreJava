package src.Strings;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacterInString {
    static void duplicatesInString(String str) {
        HashMap<Character,Integer> map = new HashMap<>();
        char[] c = str.toCharArray();

        for(int i=0;i<c.length;i++) {
            if(map.containsKey(c[i])) {
                map.put(c[i], map.get(c[i]) +1);
            }  else {
                map.put(c[i],1);
            }
        }

        for(Map.Entry<Character,Integer> hm  : map.entrySet()) {
            if(hm.getValue() > 1 ) {
                System.out.println(hm.getKey() + " " + hm.getValue());
            }
        }

        //Printing using Java 8
        map.forEach((key, value) -> {
            if(value>1) {
                System.out.println(key + " " + value);
            }
        });
    }

    public static void main(String[] args) {
        String str = "javaandjava";
        duplicatesInString(str);

    }



}
