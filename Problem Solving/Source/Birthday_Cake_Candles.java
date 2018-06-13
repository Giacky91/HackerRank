import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int birthdayCakeCandles(int n, int[] ar) {
        int max_candle = 1, max_value = ar[0];
        for(int x = 1; x < n; x++) {
            if(ar[x] > max_value) {
                max_value = ar[x];
                max_candle = 1;
            } else if(ar[x] == max_value) max_candle++;
        }
        return max_candle;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++) {
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}