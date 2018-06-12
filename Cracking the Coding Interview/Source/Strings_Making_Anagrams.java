import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static int numberNeeded(String first, String second) {
        int[] let = new int[26];
        for( char c : first.toCharArray()){
            let[c - 'a']++;
        }
		
        for( char c : second.toCharArray()){
            let[c-'a']--;
        }
		
        int result = 0;
		
        for(int i : let){
            result += Math.abs(i);
        }
        return result;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
