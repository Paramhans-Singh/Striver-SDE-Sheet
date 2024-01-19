import java.util.Scanner;

public class FibonnaciNum {
    public static int helper(int n){
        if(n==0 || n==1) return n;

        return helper(n-1)+helper(n-2);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(helper(n));
    }
}
