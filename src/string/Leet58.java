package string;

public class Leet58 {
    public static void main(String[] args) {
        System.out.println(findLengthLastWord("   fly me   to   the moon  "
        ));
    }

    private static int findLengthLastWord(String input) {
        int length = 0;
        int prev=0;
        while (input.length()>1){
            input=input.substring(1);
            length++;
            System.out.println(input);
            System.out.println(length);
            if(input.charAt(0)==' '){
                length=0;
            }
            prev=Math.max(prev,length);
        }
        return prev;
    }
}
