import java.util.Scanner;

public class checkSorted {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = s.nextInt();
        }

        boolean flag = true;

        for(int i=0; i+1<n; i++){
           if(arr[i]>arr[i+1]){
            flag = false;
            break;
           }
        }
        System.out.println(flag ? "true" : "false" );
    }
}

// chcek sorted and rotated both 

// class Solution {
//     public boolean check(int[] nums) {
//         int i = 0, flag = 0, n = nums.length;
//         boolean status = true;
//         while(i<n-1){
//             if(flag == 0){
//                 if(nums[i] > nums[i+1]){
//                     flag = 1;
//                 }
//             }else{
//                 if(nums[0] < nums[i] || nums[i] > nums[i+1])                 {
//                     status = false;
//                     break;
//                 }
//             }
//             i++;
//         }
//         if(flag == 1 && nums[0] < nums[i]) status = false;
//         return status;
//     }
// }