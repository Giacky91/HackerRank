import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long max = 0, min = 0, value = 0, sum = 0;
        max = in.nextLong();
        min = max;
        value = max;
        sum = max;
        for(int arr_i = 1; arr_i < 5; arr_i++) {
            value = in.nextLong();
            sum += value;
            if(value > max) max = value;
            if(value < min) min = value;
        }
        System.out.println((sum - max) + " " + (sum - min));        
    }
}