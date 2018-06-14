import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int getTotalX(int[] a, int[] b) {
		
        int total = 0;
        List<Integer> bDivider = new ArrayList<Integer>();
        for(int z = 1; z <= b[b.length - 1]; z++) {
            int c = 0;
            for(int x = 0; x < b.length; x++)
                if(b[x] % z == 0) c++;
            if(c == b.length) bDivider.add(z);
        }
		
        for(int div : bDivider) {
            int c2 = 0;
            for(int x = 0; x < a.length; x++)
                if(div % a[x] == 0) c2++;
            if(c2 == a.length) total++;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i = 0; b_i < m; b_i++) {
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(a, b);
        System.out.println(total);
        in.close();
    }
}