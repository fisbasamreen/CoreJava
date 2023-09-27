package src.Strings;

public class HalfUpperCase {
    public static void main(String[] args) {
        String str = "Hello World";
        int mid = str.length()/2;

        //Approach 1
        String lowerCase = "";
        String upperCase = "";

        for(int i=0; i< str.length(); i++) {
            if(i<mid) {
                lowerCase = lowerCase + Character.toLowerCase(str.charAt(i));
            } else {
                upperCase = upperCase + Character.toUpperCase(str.charAt(i));
            }
        }

        System.out.println(lowerCase+upperCase);

        //Approach 2
        String lower = str.substring(0,mid).toLowerCase();
        String upper = str.substring(mid).toUpperCase();
        System.out.println(lower+upper);
    }
}
