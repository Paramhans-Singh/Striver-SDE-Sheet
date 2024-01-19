import java.util.Scanner;

public class SieveofEroth {

    public static void helper(int num){

        boolean arr[] = new boolean[num+1];
        for(int i=0; i<=num; i++) arr[i] = true;

        for(int p=2; p*p<=num; p++){
            if(arr[p] ==true){
                for(int i = p*p; i<=num; i+=p){
                    arr[i] = false;
                }
            }
        }

        for(int i=2; i<=num; i++){
            if(arr[i]==true)System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        helper(num);
    }
}

// O(n*log(log(n))) TC
// O(n) SC
