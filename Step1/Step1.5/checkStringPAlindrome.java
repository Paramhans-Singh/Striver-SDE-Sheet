import java.util.Scanner;

public class checkStringPAlindrome {

    public static boolean helper(String str, int i){
         if(i>str.length()/2) return true;

         if(str.charAt(i)!=str.charAt(str.length()-1-i)) return false;
         return helper(str,i+1);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int n = str.length();

        boolean ans = helper(str,0);
        System.out.println(ans);
    }
}


//  s = s.replaceAll("[^a-zA-Z0-9]", "");
// s = s.toLowerCase();
// single pointer i se ho gayega as i-1 