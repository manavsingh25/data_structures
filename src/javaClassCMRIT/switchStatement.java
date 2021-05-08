package javaClassCMRIT;

public class switchStatement {
    public static void main(String[] args) {

        int arr[]={1,5,5,6,2,3,4,5};
        /**for (int i=5;i>0;i--)
        {
            System.out.print(i+"  ");
        }*/
        int count=0;
        for(int i:arr)
        {
            if(i==3)
            {
                System.out.println(count);
            }
            count++;
        }
    }
}
