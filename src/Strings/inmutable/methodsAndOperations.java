package Strings.inmutable;
/**
 *        inmutable strings are those which unlike mutable strings do not
 *        create a separate object or another string to perform operations
 *        like addition ..also the inmutable strings can be changed once
 *        declared unlike mutable string example string buffer and
 *        string builder.....
 *
 *        an object is considered to be im=nmutable if its state cannot
 *        change after it's constructed..........
 */
public class methodsAndOperations {
    public static void main(String[] args) {
    String n1 ="manav";
    String n2 = "singh";
    String fullName = n1.concat(" ").concat(n2);
        System.out.println(fullName);

    }
}
