package collection.stack;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParanthesis {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string:");
        String str=sc.next();
        boolean res=balparenthesis(str);
        System.out.println(res);

    }
    public static boolean balparenthesis(String str){
        Stack<Character> stack=new Stack<Character>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='('||ch=='{'||ch=='['){
                stack.push(ch);
            }else if((stack.size()>0) && (ch=='}'&&stack.peek()=='{')
                                       ||(ch==')'&&stack.peek()=='(')
                                       ||(ch==']' && ch=='[')){
                stack.pop();
            }
        }
        if(stack.size()==0){
            return true;
        }
        return false;
    }
}
