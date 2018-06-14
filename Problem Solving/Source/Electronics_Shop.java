import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int getMoneySpent(Integer[] keyboards, int[] drives, int s) {
		
        Arrays.sort(keyboards, Collections.reverseOrder());
        Arrays.sort(drives);
        int max = -1;
        for(int x = 0 , y = 0; x < keyboards.length; x++){
            for( ; y < drives.length; y++){
                if(keyboards[x] + drives[y] > s) break;
                if(keyboards[x] + drives[y] > max){
                    max = keyboards[x] + drives[y];
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();
        Integer[] keyboards = new Integer[n];
        for(int keyboards_i=0; keyboards_i < n; keyboards_i++) {
            keyboards[keyboards_i] = in.nextInt();
        }
        int[] drives = new int[m];
        for(int drives_i=0; drives_i < m; drives_i++) {
            drives[drives_i] = in.nextInt();
        }
		
        int moneySpent = getMoneySpent(keyboards, drives, s);
        System.out.println(moneySpent);
    }
}