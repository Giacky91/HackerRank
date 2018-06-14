import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int migratoryBirds(int n, int[] ar) {
        int[] birds = new int[5];
        for(int x = 0; x < n; x++) {
            birds[ar[x] - 1]++;
        }
        int max = 0, pos = 0;
        for(int x = 0; x < 5; x++) {
            if(birds[x] > max){
                max = birds[x];
                pos = x + 1;
            } 
        }
        return pos;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++) {
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}