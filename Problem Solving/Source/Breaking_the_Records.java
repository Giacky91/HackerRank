import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] getRecord(int[] s) {
		
        int[] recs = {0, 0};
        int high = s[0], low = s[0];
        for(Integer i: s) {
            if(i > high) {
                recs[0]++;
                high = i;
            }
            if( i < low) {
                recs[1]++;
                low = i;
            }
        }
        return recs;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int[] result = getRecord(s);
        String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
    }
}