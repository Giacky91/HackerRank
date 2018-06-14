import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int sockMerchant(int n, int[] ar) {
        int total = 0;
        int[] tot = new int[101];
        for(int x = 0; x < n; x++) {
            tot[ar[x]]++;
            if(tot[ar[x]] % 2 == 0) {
                total++;
                tot[ar[x]] = 0;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++) {
            ar[ar_i] = in.nextInt();
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}