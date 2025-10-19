package math;

public class Leetcode258 {
    public static void main(String[] args) {
        addDigits(38);
    }

    private static void addDigits(int i) {

        int cnt=0;
        while(i/10>0){
          int  sum=0;
            sum+=i%10+i/10;
            System.out.println(sum);
            i=sum;
            cnt++;
        }
        System.out.println(cnt);
    }
}
