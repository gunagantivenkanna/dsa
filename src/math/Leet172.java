package math;

public class Leet172 {
    public static void main(String[] args) {
        int cnt=trailingZeroes(13);
        System.out.println(cnt);
    }
   static   public int trailingZeroes(int n) {
       long res= findFact(n);
       System.out.println(res);
       int cnt=0;
       while(true){
        long t=res;
        long k=res%10;
        res=t/10;
if(k!=0)break;
cnt++;
       }
       return cnt;
    }

   static private long findFact(int n) {
        if(n==1)return 1;
return n*findFact(n-1);
    }
}
