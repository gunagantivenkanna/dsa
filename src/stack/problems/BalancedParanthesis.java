package stack.problems;


import java.util.Stack;

public class BalancedParanthesis {
    public static void main(String[] args) {
        String s="()[]{f}";
        System.out.println(isValidParanthesis(s));
    }

    private static boolean isValidParanthesis(String s) {
        Stack<Character> characterStack=new Stack<>();
        for(char c:s.toCharArray()){
            System.out.println(c);
            if(c=='(')characterStack.push(')');
            else if(c=='{')characterStack.push('}');
            else if (c=='[')characterStack.push(']');
            else {
                if(characterStack.pop()!=c){
                    return false;
                }
            }
        }
        return true;
    }
}
