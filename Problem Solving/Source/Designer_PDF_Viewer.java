import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] h = new int[26];
        for(int h_i = 0; h_i < 26; h_i++) {
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        int max = 0;
        int length = word.length();
        for(int x = 0; x < length; x++) {
            char a = word.charAt(x);
            if(max < h[a - 97])
                max = h[a - 97];
        }
        System.out.println(max * length);
    }
}