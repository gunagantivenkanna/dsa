package arrays;

import java.util.*;

public class FindDuplicates {
    public static void main(String[] args) {
        int []arr={4,3,2,7,8,2,3,1};
//        findDuplicates(arr);
//        findDuplicatesWithMap(arr);
//        findDuplicatesWithArray(arr);
//        findDuplicatesWithHashSet(arr);
        findDuplicatesinPlace(arr);
    }

    private static void findDuplicatesinPlace(int[] arr) {
        List<Integer> res=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int index=Math.abs(arr[i])-1;
            if(arr[index]<0){
                res.add(Math.abs(arr[i]));
            }
            else {
//                mark as visited with negative sign
                arr[index]=-arr[index];
            }
        }
        System.out.println(res);
    }

    private static void findDuplicatesWithHashSet(int[] arr) {
        Set<Integer> set=new HashSet<>();
        Set<Integer> duplicates=new HashSet<>();
        for (int n:arr){
            if(!set.add(n)) duplicates.add(n);
        }
        System.out.println(duplicates);
    }

    private static void findDuplicatesWithArray(int[] arr) {
        int newArray[]=new int[arr.length+1];
        for (int i = 0; i <arr.length ; i++) {
            newArray[arr[i]]++;
        }
        for (int i = 0; i < newArray.length; i++) {
            if(newArray[i]>1) System.out.println(i);
        }
    }

    private static void findDuplicatesWithMap(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int val=map.getOrDefault(arr[i],0);
            map.put(arr[i],++val);
        }
        for (Map.Entry<Integer,Integer> ma:map.entrySet()){
            if(ma.getValue()>1)
            System.out.println(ma.getKey());
        }
    }

    private static void findDuplicates(int[] arr) {
            int temp=0;
Map<Integer,Integer> m=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int a=arr[i];

            for (int j = i+1; j < arr.length; j++) {
                if(a==arr[j]&&!m.containsKey(a)) {m.put(a,j);System.out.println(a);}
            }
        }
    }
}
