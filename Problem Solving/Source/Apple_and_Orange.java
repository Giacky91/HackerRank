import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    private static void touchHouse(int[] apple, int[] orange, int s, int t, int a, int b) {
        int app = 0, ora = 0;
        //apple
        for(int x = 0; x < apple.length; x++) {
            if(a + apple[x] >= s && a + apple[x] <= t)
                app++;
        }
        //orange
        for(int x = 0; x < orange.length; x++) {
            if(b + orange[x] >= s && b + orange[x] <= t)
                ora++;
        }
        System.out.println(app);
        System.out.println(ora);
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++) {
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++) {
            orange[orange_i] = in.nextInt();
        }
        touchHouse(apple, orange, s, t, a, b);
    }
}