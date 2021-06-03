package Strings.mutableString;

public class StringCapacity {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        /**
         * as the name suggests that this method will return us the capacity of
         * the particular string..
         * in other words it will tell us the length of the particular string..
         * or the number of character present in an particular string.......
         */
        System.out.println(sb.capacity());
        sb.append("hello");
        System.out.println(sb.capacity());
        sb.append(",java is my favourite programming language bc");
        System.out.println(sb.capacity());
        System.out.println(sb);
    }
}
