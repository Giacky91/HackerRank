import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int beautifulDays(int i, int j, int k) {
        int reverseNum = 0, beautiful = 0, diff = 0;
        double divRes = 0;
        for(int x = i; x <= j; x++ ) {
            reverseNum = reverse(x);
            diff = Math.abs(x - reverseNum);
            if( diff % k == 0)
                beautiful++;
        }
      return beautiful;  
    }
    
    static int reverse(int i) {
        int reverse = 0;
        while(i != 0) {
            reverse = reverse * 10;
            reverse = reverse + i % 10;
            i = i / 10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int j = in.nextInt();
        int k = in.nextInt();
        int result = beautifulDays(i, j, k);
        System.out.println(result);
        in.close();
    }
}