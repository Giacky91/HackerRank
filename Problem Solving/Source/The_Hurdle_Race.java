import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int height = 0;
        int bev = 0;
        for(int height_i=0; height_i < n; height_i++) {
            height = in.nextInt();
            if(height > k) {
                bev += (height - k);
                k = height;
            }
        }
        System.out.println(bev);
    }
}