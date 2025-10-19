package basichashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountFrequency {
    public static void main(String[] args) {
int input[]={0,10,5,10,15,10,5};
//        System.out.println(countFreq(input));
//        System.out.println(countFreqMap(input));
        System.out.println(findHighandLow(input));
    }

    private static Object findHighandLow(int[] input) {
        Map<Integer,Integer> res=new HashMap<>();
        res=countFreqMap(input);
 Integer maxKey = res.entrySet()
                    .stream()
                    .max(Map.Entry.comparingByValue())
                    .get()
                    .getKey();

Integer minKey = res.entrySet()
                    .stream()
                    .min(Map.Entry.comparingByValue())
                    .get()
                    .getKey();
Integer maxValue=res.entrySet().stream().max(Map.Entry.comparingByValue()).get().getValue();

System.out.println("Max key = " + maxKey+" "+maxValue);
System.out.println("Min key = " + minKey);

        return res;
    }

    private static Map countFreqMap(int[] input) {
        Map<Integer,Integer> res=new HashMap<>();
        int cnt=0;
        int i=0;
        while(i<input.length){
            cnt=res
                    .getOrDefault(input[i],0);
            res.put(input[i],++cnt);
            i++;

        }
        return res;
    }

    private static String countFreq(int[] input) {
        int cnt=0;
        int[] res=new int[16];
        for (int i = 0; i <input.length ; i++) {
            res[input[i]]++;
        }
        int target=1;
        for (int i = 0; i <input.length ; i++) {
            if(target==input[i]){
                cnt++;
            }
        }
        return Arrays.toString(res);

    }
}
