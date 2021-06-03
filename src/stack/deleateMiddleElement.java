package stack;
import java.io.*;
import java.util.*;

public class deleateMiddleElement {
    static void deleteMid(Stack<Character> st,int n, int curr)
    {
        //if the stack is empty or full then return......
        if (st.empty() || curr == n)
            return;
        //if not empty then start popping the elements
        //and store it in a variable
        char x = st.pop();
        deleteMid(st, n, curr+1);
        //this if statement will push all the elements except the middle element
        if (curr != n/2)
            st.push(x);
    }
    public static void main(String[] args) {
        Stack<Character> st = new Stack<Character>();
        st.push('0');
        st.push('1');
        st.push('2');
        st.push('3');
        st.push('4');
        st.push('5');
        st.push('6');
        st.push('7');
        st.push('8');
        st.push('9');
        // calling the method deleteMid
        deleteMid(st, st.size(), 0);
        //print the list without the middle element...
        while (!st.empty())
        {
            char p=st.pop();
            System.out.print(p + " ");
        }
    }
}
