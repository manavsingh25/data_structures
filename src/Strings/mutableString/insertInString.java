package Strings.mutableString;

public class insertInString {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("hello");
        //it will insert "java" at the index value 1....
        sb.insert(1,"java");
        System.out.println(sb);
        //at index 3 it will insert the following string
        sb.insert(3,"hergiuytrbibhvi");
        System.out.println(sb);
    }
}
