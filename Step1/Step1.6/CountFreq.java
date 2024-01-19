import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountFreq {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] =s.nextInt();
        }

        HashMap<Integer,Integer> map = new HashMap<>();
        for(Integer ele : arr){
            // if(map.containsKey(ele)){
            //     int freq = map.get(ele)+1;
            //     map.put(ele, freq);
            // }
            // else{
            //     map.put(ele, 1);
            // }

            map.put(ele, map.getOrDefault(ele, 0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+" " + entry.getValue());
        }
    }
}
