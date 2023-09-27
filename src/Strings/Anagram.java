package src.Strings;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        System.out.println(isAnagram(str1,str2));

    }

    static boolean isAnagram(String a, String b) {
        char[] arrA = a.toCharArray();
        char[] arrB = b.toCharArray();

        if(arrA.length != arrB.length) {
            return false;
        }

        int[] count = new int[256];

        for(int i=0; i<a.length();i++) {
            count[arrA[i]]++;
            count[arrB[i]]--;
        }

        for(int i=0;i<256;i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;

    }
}
