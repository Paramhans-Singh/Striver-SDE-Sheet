import java.util.Scanner;

public class Insertion {

    public static void helper(int arr[]){
         int n = arr.length;

         for(int i=0; i<n; i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){

                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;

                j--;
            }
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


//  O(N2), (where N = size of the array), for the worst, and average cases and best case ---> o(n)