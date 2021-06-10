package aarays;

/**
 *      in this we need to create two arrays and then compare the elements of two arrays
 *      and then print the number of occurances of an particular element.....
 */
public class SparceArray {
    public static void main(String[] args) {
        int arr1[]={1,2,3};
        int arr2[]={1,2,3,1,2,3,3,3,2,1,2,2,2,3,1,2,3,1};
        int count=0;
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr2.length;j++)
            {
                if(arr1[i]==arr2[j])
                {
                    count++;
                }
            }
            System.out.println(count);
            count =0;
        }
    }
}
