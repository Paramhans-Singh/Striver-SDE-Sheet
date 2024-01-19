import java.util.Scanner;

public class Removeduplicates {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = s.nextInt();
        }

        int j=0;

        for(int i=0; i+1<n; i++){
         if(arr[i] != arr[j]){
            j++;
           arr[j] = arr[i];
         }
        }

        for(int i=0; i<j+1; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
