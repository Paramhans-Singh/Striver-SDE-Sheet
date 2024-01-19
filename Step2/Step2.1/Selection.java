import java.util.Scanner;

public class Selection {
    public static void helper(int arr[]){
        int length = arr.length;

        for( int i=0; i<length; i++){
            int min = Integer.MAX_VALUE;
            int minIndex = 0;

            for(int j=i; j<length; j++){
               if(arr[j]<min){
                minIndex = j;
                min = arr[j];
               }
            }

            int temp = arr[i];
            arr[i] = min;
            arr[minIndex] = temp;
        }
    }
      public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = s.nextInt();
        }

        helper(arr);

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }

    }
}


// O(N2), (where N = size of the array), for the best, worst, and average cases.