import java.util.Scanner;

public class GCDofNum {
    public static int helper(int a , int b){
        if(b==0) return a;
        return helper(b,a%b);
        // ecludian formula 
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int num2 = s.nextInt();

        int ans = helper(num,num2);
        System.out.println(ans);
    }
}


// O(logɸmin(a,b)), where ɸ is 1.61