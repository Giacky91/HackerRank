import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static boolean isBalanced(String expression) {
        if(expression.length() % 2 == 1) return false;
        Stack<Character> par = new Stack<>();
        while (expression.length() > 0){
            char car = expression.charAt(0);
            switch(car){
                case '(': par.push(')');
                    break;
                case '[': par.push(']');
                    break;
                case '{': par.push('}');
                    break;
                default:
                    if(par.empty() || car != par.peek())
                        return false;
                    par.pop();
                    break;
            }
            expression = expression.substring(1);
        }
        return par.empty();
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}