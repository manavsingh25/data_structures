package Strings.mutableString;

public class ReverseString {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("hello");
        /**
         * as the name suggests this method will reverse the
         * following sting and display the reversed string..
         */
        sb.reverse();
        System.out.println(sb);
    }
}
