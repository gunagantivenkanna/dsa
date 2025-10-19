package basicrecursion;

import java.util.Arrays;

public class BasicRecursion {
    public static void main(String[] args) {
        int n=5;
        int r=0;
//        printNnumbers(n);
       int res= sumOfNaturalNumbers(n,r);
//        System.out.println(res);
       int ress[]= reverseArray(new int[]{1,2,3,4,5,6},0,5 );
        System.out.println(Arrays.toString(ress) );
    }

    private static int[] reverseArray(int[] ints,int i,int j) {
        if (i>ints.length/2-1) return ints;;
 int temp=ints[i];
        ints[i]=ints[j];
        ints[j]=temp;
        System.out.println(Arrays.toString(ints));
        ints=reverseArray(ints,++i,--j);

        return ints;
    }


    private static int sumOfNaturalNumbers(int n,int res) {
        if(n<1) return 1;
      res= sumOfNaturalNumbers(n-1,res);
         res*=n;
        return res;

    }

    private static void printNnumbers(int n) {
        if (n==0)return;
        printNnumbers(n-1);
        System.out.println(n);
    }

}
