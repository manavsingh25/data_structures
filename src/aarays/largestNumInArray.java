package aarays;

public class largestNumInArray {
    public static void main(String[] args) {
        int a[]= {0,1,2,3,4,5,6};
        int largest_num = a[0];
        for(int i=0;i<a.length;i++)
        {
            if(largest_num<a[i])
            {
                largest_num = a[i];
            }
        }

        System.out.println(largest_num);
    }
}
