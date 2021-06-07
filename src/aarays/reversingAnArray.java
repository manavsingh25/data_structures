package aarays;

/**
 *      same code hacker-rank p nhi chlara bhenchod..alag bakchodi h sali
 */
public class reversingAnArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int mid=(arr.length/2)+1;
        for(int i=0;i<mid;i++)
        {
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
