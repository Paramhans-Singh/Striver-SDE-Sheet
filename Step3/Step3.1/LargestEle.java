import java.util.Scanner;

public class LargestEle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        
        int maxV = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            arr[i] = s.nextInt();
            maxV = Math.max(maxV, arr[i]);
        }
System.out.println(maxV);

    }
}

// max mai Integer.MIN hota hai and min mai Integer.MAX
