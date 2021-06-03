package Strings.mutableString;

/**
 *      the ensureCapacity() method of string buffer class ensures that the given capacity
 *      is the minimum to the current capacity..
 *      if it is greater than the current capacity,it increases the capacity by
 *      (oldCapacity*2)+2 ..for example ,if your current capacity is 16, then after increasing
 *      it will be (16*2)+2=34......so the new capacity will be 34........
 */

public class EnsureCapacity {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());
        sb.append("hello");
        System.out.println(sb.capacity());
        sb.append(",java is my favourite programming language");
        System.out.println(sb.capacity());
        sb.ensureCapacity(10);
        System.out.println(sb.capacity());
        sb.ensureCapacity(50);
        System.out.println(sb.capacity());
    }
}
