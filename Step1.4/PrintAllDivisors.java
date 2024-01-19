import java.util.Scanner;

public class PrintAllDivisors {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        for(int i=1; i<= (int) Math.sqrt(num); i++){
          if(num%i == 0){
            System.out.print(i+ " ");
            if(i != num/i) System.out.print(num/i+ " ");
          }
        }
    }
}

// O(sqrt(n)) TC
