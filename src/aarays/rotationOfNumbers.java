package aarays;

/**
 *      it is the right rotation of the elements present in an array
 *      it only rotates the array only once,but if add another for loop
 *      on the pre existing for loop then we can right rotate the array
 *      any number of time we want..
 */
public class rotationOfNumbers {
    public static void main(String[] args) {
//        int arr[] ={4,3,8,9,6,7};
//        int last = arr[arr.length-1];
//        for(int i=arr.length-1;i>0;i--)
//        {
//            arr[i]=arr[i-1];
//        }
//        arr[0] = last;
//        for(int i=0;i<arr.length;i++)
//        {
//            System.out.print(arr[i]+"  ");
//        }
        int arrr[]={0,1,2,3,4,5,6,7,8,9};
        int k=2;
        for(int i=0;i<k;i++)
        {
            int front = arrr[0];
            for(int j=1;j<arrr.length;j++)
            {
                arrr[j-1]=arrr[j];
            }
            arrr[arrr.length-1]=front;
        }
        for(int i=0;i<arrr.length;i++)
        {
            System.out.print(arrr[i]+"  ");
        }
    }
}
