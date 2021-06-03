package Strings.mutableString;

public class deleteString {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("hello");
        /**
         * it will delete the elements at the index value
         * 1 and 2 ..and after deleting these characyers from
         * the string it will display the remaining string..
         */
        sb.delete(1,3);
        System.out.println(sb);
    }
}
