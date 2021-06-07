package Strings.mutableString;
import java.util.Locale;
/**
 *             in java the string is nothing but an object that
 *             represents a sequence of characters.............
 *             mutable strings are those which cannot be edited or changed
 *             once initialized ..it is what it is....that's it.....
 *             in java, everything is an object................
 *             in java the strings are mutable which means that if we
 *             add some another string to an pre-existing string then it will
 *             not simply add both the strings and display the resulting
 *             string but in mutable string case it will create another
 *             string and will add both the strings in that third string
 *            and then display the result.........................
 */
    public class operationsAndMethods1 {
        public static void main(String[] args) {
            /**
             * how to create the string, and its few ways
             * how to convert an array of characters into string..
             */
            String s1="java";//creating string by java string literal
            char ch[]={'s','t','r','i','n','g','s'};
            String s2=new String(ch);//converting char array to string
            String s3=new String("example");//creating java string by new keyword
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s3);
            System.out.println(s1.length());//in-build function to find the length of an string
            System.out.println(s2.length());
            System.out.println(s3.length());
            //to find what element is present at the particular index value
            System.out.println(s3.charAt(4));
            System.out.println(s1.charAt(3));
            //to check weather the particular string is empty or not
            System.out.println(s1.isEmpty());
            //to perform concatenation operation on 2 strings
            System.out.println(s1.concat(s2));
            //to insert the escape character inside the string and print the double quotes
            String txt = "We are the so-called \"Vikings\" from the north.";
            System.out.println(txt);
            String txt1 = "It\'s alright.";
            System.out.println(txt1);
            String txt2 = "The character \\ is called backslash.";
            System.out.println(txt2);
            //to convert string to upper case and vice versa
            String txt3="Hello World";
            System.out.println(txt3.toLowerCase());
            System.out.println(txt3.toUpperCase());
            //to find the index of particular character in the string starts..
            String s4 ="please locate where occurs!";
            System.out.println(s4.indexOf("occurs!"));
        }
    }
