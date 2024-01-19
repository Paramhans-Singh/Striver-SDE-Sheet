import java.util.Scanner;

public class Print1toN {
    public static void helper(int num,int ind){
        if(ind > num) return;
        System.out.print(ind+" ");
        helper(num, ind+1);
    }
 public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int num = s.nextInt();
        helper(num,1);
    }   
}
