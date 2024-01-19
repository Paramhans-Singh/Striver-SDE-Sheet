import java.util.Scanner;

public class factorialofN {

    public static void helper(int n, int fact){
        if(n==1){
            System.out.println(fact);
            return;
        }
        
        fact *=n;
        helper(n-1,fact);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        helper(n, 1);
    }
}
