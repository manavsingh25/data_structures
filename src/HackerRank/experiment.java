package HackerRank;

public class experiment {
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
    }
}
