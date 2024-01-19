import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        boolean flag = true;

        for(int i=2; i<=(int)Math.sqrt(num); i++){
            if(num%i==0){
                flag = false;
                break;
            }
        }

        System.out.println(flag ? "YES" : "NO");
    }
}

// O(√n)