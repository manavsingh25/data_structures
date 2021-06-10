package aarays;

import java.util.ArrayList;
import java.util.List;

public class reversingAnArray {
    public static void main(String[] args) {
        int arr[]={1,4,3,2,4,5,6,7,7,7,56,6,7,87,34};
        int mid=(arr.length/2);
        for(int i=0;i<mid;i++)
        {
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        List output = new ArrayList();
        for(int i=0;i<arr.length;i++)
        {
            output.add(arr[i]);
        }
        System.out.println(output);
    }
}
