import java.util.Scanner;

public class Bubble {

    public static void swap (int arr[], int j){
       int temp = arr[j];
       arr[j]=arr[j+1];
       arr[j+1]=temp;
    }
    public static void helper(int arr[]) {
        int n = arr.length;
        boolean flag = false;

        for(int i=0; i<n; i++){
          for(int j=0; j+1<n-i; j++){
            if(arr[j]>arr[j+1]){
                swap(arr,j);
                flag = true;
            }
            }
            if(flag == false) break;
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

//  Time Complexity: O(N2) for the worst and average cases and O(N) for the best case. Here, N = size of the array.
