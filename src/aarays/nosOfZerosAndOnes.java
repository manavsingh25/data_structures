package aarays;

public class nosOfZerosAndOnes {
    public static void main(String[] args) {
        int a[]={0,2,1,0,2,0,1,1,0,2};
        int no_of_zeros = 0;
        int no_of_ones = 0;
        int no_of_two = 0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==0)
            {
                no_of_zeros = no_of_zeros + 1;
            }
            else if(a[i]==1)
            {
                no_of_ones = no_of_ones + 1;
            }
            else{
                no_of_two = no_of_two +1;
            }
        }
        System.out.println("number of zeros : "+no_of_zeros);
        System.out.println("number of ones : "+no_of_ones);
        System.out.println("number of twos : "+no_of_two);
    }
}
