package aarays;

public class rotationOfNumbers {
    public static void main(String[] args) {
        int arr[] ={4,3,8,9,6,7};
        int last = arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[0] = last;
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+"  ");
        }
    }
}
