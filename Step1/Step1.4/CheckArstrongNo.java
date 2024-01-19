import java.util.Scanner;

public class CheckArstrongNo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int temp = num;
        int armNum = 0;

        String str = Integer.toString(num);
        int length = str.length();

        while(temp!=0){
         int rem = temp%10;
         armNum += Math.pow(rem,length);
         temp/=10;
        }

        System.out.println(num==armNum);
    }
}


// 1^3 + 5^3 + 3^3 = 153