package math;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class leet204 {
    public static void main(String[] args) {
//        System.out.println(cntPrimes(5000000));
        System.out.println(cnt(30));
    }

    //optimal solution sieve of eratostenes
    private static int cnt(int n) {
        boolean isPrime[] = new boolean[n - 1];
        Arrays.fill(isPrime, true);

        isPrime[0] = false;
        isPrime[1] = false;
        System.out.println(Arrays.toString(isPrime));
        for (int i = 2; i*i <=n ; i++) {
            if(isPrime[i]==true){
                for (int j = i*i; j < n; j+=i) {
                    isPrime[j]=false;
                }
            }
        }
        System.out.println(Arrays.toString(isPrime));
        IntStream.range(2,isPrime.length).filter(leet204::isPrime).forEach(System.out::println);
        return 1;
    }

    //bruteforce not ideal for large inputs
    private static int cntPrimes(int n) {
        if (n < 2) return 0;
        int cnt = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                cnt++;
            }
            ;
        }
        return cnt;
    }

    private static boolean isPrime(int n) {
        for (int j = 2; j * j <= n; j++) {
            if (n % j == 0) return false;
        }
        return true;
    }
}
