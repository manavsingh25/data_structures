package Algorithms;

public class selectionSort {
    public static void main(String[] args) {
        int a[]={3,5,1,6,12,8,2,56,8};
        int smallest_num;
        int j;
        for(int i=0;i<a.length;i++)
        {
            smallest_num=a[i];
            for(j=i+1;j<a.length;j++)
                if(smallest_num>a[j]) {
                    smallest_num = a[j];
                    int temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
        }
        for(int n=0;n<a.length;n++)
        {
            System.out.print(a[n]+"  ");
        }
    }
}
