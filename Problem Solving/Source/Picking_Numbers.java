import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void distance(int n, int[] ar) {
        int distance = 0, tmpDist = 0;
        Arrays.sort(ar);
        for(int x = 0; x < n - 1; x++) {
            for(int y = x; y < n; y++) {
                if(Math.abs(ar[x] - ar[y]) <= 1)
                    tmpDist++;
                    
            }
            if(tmpDist > distance) distance = tmpDist;
            tmpDist = 0;
        }
        System.out.println(distance == 1 ? 0 : distance);
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        distance(n, a);
    }
}