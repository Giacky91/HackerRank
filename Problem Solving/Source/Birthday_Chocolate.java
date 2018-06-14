import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int solve(int n, int[] s, int d, int m) {
		
        int tot = 0;
        for(int x = 0; x <= s.length - m; x++) {
            int sum = 0;
            for(int z = 0; z < m; z++)
                sum += s[x + z];
            if(sum == d) tot++;
        }
        return tot;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i = 0; s_i < n; s_i++) {
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = solve(n, s, d, m);
        System.out.println(result);
    }
}