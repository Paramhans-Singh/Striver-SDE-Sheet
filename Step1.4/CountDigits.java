import java.util.Scanner;

public class CountDigits{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        String str = Integer.toString(num);
        System.out.println(str.length());
    }
}