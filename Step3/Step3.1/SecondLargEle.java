import java.util.Scanner;

public class SecondLargEle {
    public static void main(String[] args) {
        
     Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        
        int maxV = Integer.MIN_VALUE;
        int SmaxV = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            arr[i] = s.nextInt();

            if(arr[i]>maxV){
            SmaxV = maxV;
            maxV = arr[i];
            }
            else if (arr[i]>SmaxV){
                SmaxV = arr[i];
            }
        }

        System.out.println(SmaxV);
}

}