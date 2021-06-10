package HackerRank;

/**
 *      in this question we need to create one array with elements as zeros,
 *      and then add the number to the array index wise and then add the
 *      elements three times in the same manner and then print the final answer.
 */
public class ArrayManipulation {
    public static void main(String[] args) {
        int arr[]={0,0,0,0,0,0,0,0,0,0};
        for (int z = 0; z < arr.length; z++) {
            System.out.print(arr[z] + " ");
        }
        System.out.println();
        for(int i=0;i<arr.length;i++) {
            if (i >= 0 && i < 5) {
                arr[i] = arr[i] + 3;
            }
        }
        for (int z = 0; z < arr.length; z++) {
            System.out.print(arr[z] + " ");
        }
        System.out.println();
        for(int i=0;i<arr.length;i++) {
            if (i >= 3 && i < 8) {
                arr[i] = arr[i] + 7;
            }
        }
        for (int z = 0; z < arr.length; z++) {
            System.out.print(arr[z] + " ");
        }
        System.out.println();
        for(int i=0;i<arr.length;i++) {
            if(i>=5&&i<9)
            {
                arr[i]=arr[i]+1;
            }
        }
        for(int z=0;z<arr.length;z++)
        {
            System.out.print(arr[z]+" ");
        }
        System.out.println();
    }
}
