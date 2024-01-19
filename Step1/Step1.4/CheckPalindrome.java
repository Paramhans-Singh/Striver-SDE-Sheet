import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int temp = num;
        int reverse = 0;
   // negative no. are not palindrome
   
        while(temp>0){
           int rem = temp%10;
           reverse = reverse*10 + rem;
           temp/=10;
        }
        System.out.println(num==reverse);
    }
}
