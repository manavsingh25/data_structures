package Strings.mutableString;

public class replaceString {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("hello");
        //it will insert a new string in between of the previous one
        //in such a way that ,it will start insertion the new string
        //from index value 1 to index value 2 and also it will remove the
        //characters from the previous string from index value 1,3...
        //which means that the character present at the index value
        // 1 and 2 will be removed and at that place the new string is inserted..
        sb.replace(1,3,"java");
        System.out.println(sb);
    }
}
