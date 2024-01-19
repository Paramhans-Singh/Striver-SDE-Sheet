import java.util.Scanner;

public class SumofFirstN {
      public static void helper(int num,int sum, int ind){
        if(ind > num){
            System.out.println(sum);
            return;
        }
        sum+=ind;
        helper(num,sum, ind+1);
    }
 public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int num = s.nextInt();
        helper(num,0,0);
    }   
}
