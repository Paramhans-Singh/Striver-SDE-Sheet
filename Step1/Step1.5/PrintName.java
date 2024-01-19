import java.util.Scanner;

public class PrintName {

    public static void helper(int num){
        if(num==0) return;

        System.out.println("Param");

        helper(num-1);
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int num = s.nextInt();
        helper(num);
    }
}
