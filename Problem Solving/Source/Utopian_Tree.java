import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int total = 1;
        for(int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            if( n == 0)
                total = 1;
            else
                for(int z = 0; z < n; z++) {
                    if(z % 2 == 0) {
                        total *= 2;
                    } else {
                        total++;
                    }
                }
            System.out.println(total);
            total = 1;
        }
    }
}