import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindHiighLowFreq {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] =s.nextInt();
        }

        HashMap<Integer,Integer> map = new HashMap<>();
        for(Integer ele : arr){
            map.put(ele, map.getOrDefault(ele, 0)+1);
        }

        int maxV = Integer.MIN_VALUE;
        int minV = Integer.MAX_VALUE;
        int minEle = 0, maxEle = 0;
// we can give the ele in single row also 

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()<minV){
            minEle = entry.getKey();
            minV = entry.getValue();
            }

            if(entry.getValue()>maxV){
                maxEle = entry.getKey();
                maxV = entry.getValue();
            }
        }

        System.out.println(maxEle+" " +minEle);
    }
}
