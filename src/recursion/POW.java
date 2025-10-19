package recursion;

public class POW {
    public static void main(String[] args) {
       double res= myPow(2,-2);
        System.out.println(res);
    }

  static double myPow(double x, int n) {
        int N=n;
        if(N<0){
            x=1/x;
            n=-n;
        }
        if(n<=0) return 1;
        double res=myPow(x,n-1);
        return x*res;
    }
}
