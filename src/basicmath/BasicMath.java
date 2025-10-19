package basicmath;

public class BasicMath {
    public static void main(String[] args) {
        int i = 1770;
        int cnt = 0;
//        System.out.println(cntDigits(i,cnt));
//        System.out.println(reverseNumber(i));
//        System.out.println(findGCD());
//        System.out.println(checkArmstrong());
//        divisors(i);
//        System.out.println(checkPrime(i));
//        printPrimes(i);
    }

    private static void printPrimes(int i) {
        for (int j = 2; j <=i; j++) {
            if(checkPrime(j)){
                System.out.println(j);
            }
        }
    }

    private static boolean checkPrime(int i) {
        int cnt=0;
        for (int j = 2; j < i; j++) {
            if(i%j==0){
                cnt++;
            }
            if (cnt>0){
                return false;
            }

        }
        return true;
    }

    private static void divisors(int i) {
        for (int j = 1; j <=Math.sqrt(i); j++) {
            if(i%j==0) System.out.print(j+" "+i/j+" ");
        }
    }

    private static boolean checkArmstrong() {
        int n = 153;
        int temp = n;
        int sum = 0;
        int digit;
        while (n > 0) {
            digit = n % 10;
            sum += Math
                    .pow(digit, 3);
            n /= 10;
        }
        if (sum == temp) return true;
        return false;
    }

    private static int findGCD() {
        int m = 24;
        int n = 18;
        int max = Math.max(m, n);
        for (int i = max; i > 1; i--) {
            if (m % i == 0 && n % i == 0) {
                return i;
            }
        }
        return -1;
    }

    private static int reverseNumber(int i) {
        int temp = 0;
        while (i > 0) {
            temp = temp * 10 + i % 10;
            i /= 10;
        }


        return temp;
    }

    static int cntDigits(int i, int cnt) {

        return (int) Math.floor(Math.log10(i) + 1);
    }

}
