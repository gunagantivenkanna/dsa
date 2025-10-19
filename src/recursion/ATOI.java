package recursion;

public class ATOI {

    public static void main(String[] args) {
        String s = "-9128y472332";
//        System.out.println(Integer.parseInt(s.trim()));
        boolean flag = false;


        int ans = myAtoi(s, flag);
        System.out.println(ans);
    }

    static int myAtoi(String s, boolean flag) {
        s = s.strip();
        int c = s.startsWith("-") ? -1 : 1;
        s = s.startsWith("-") ? s.substring(1) : s;
        while (s.length() > 0 && s.startsWith("0")) {
            s = s.substring(1);
        }
        long x = helper(s, flag);
        long res = x > Integer.MAX_VALUE ? Integer.MIN_VALUE : x;
        System.out.println(Integer.MIN_VALUE);
        return (int) (c * res);

    }

    static long helper(String s, boolean flag) {
        if (!Character.isDigit(s.charAt(0))) return 0;
        if (s.length() == 1) return s.charAt(0) - '0';

        long k = helper(s.substring(0, s.length() - 1), flag);
        if(flag)return k;
        int lastDigit = s.charAt(s.length() - 1) - '0';
        if (!Character.isDigit(s.charAt(s.length() - 1))) {
            flag = true;
            return k;
        }
        if (flag) return k;
        return k * 10 + lastDigit;

    }
}
