package Algorithms;

/**
 *
 *
 *          pseudo code
 *          i=1;
 *          while i<a.length
 *              j=1;
 *              while j>0 and a[j-1]>a[j]
 *                  swap a[j] and a[j-1]
 *                  j=j-1
*                end while
 *               i=i+1
*            end while'
 *
 *
 *
 */
public class InsersionSort {
    public static void main(String[] args) {
        int a[]={1,8,0,9,2,5,7,3,5};
        for(int i=1;i<a.length;i++)
        {
            for (int j=i;j>0&&a[j-1]>a[j];j--)
            {
                int temp=a[j];
                a[j]=a[j-1];
                a[j-1]=temp;
            }
        }
        for(int m=0;m<a.length;m++)
        {
            System.out.print(a[m]+"   ");
        }
    }
}
