import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        double pos = 0, neg = 0, zer = 0;
        for(int arr_i=0; arr_i < n; arr_i++) {
            arr[arr_i] = in.nextInt();
            pos += arr[arr_i] > 0 ? 1.0 : 0.0;
            neg += arr[arr_i] < 0 ? 1.0 : 0.0;
            zer += arr[arr_i] == 0 ? 1.0 : 0.0;
        }
        System.out.println(pos / n);
        System.out.println(neg / n);
        System.out.println(zer / n);
    }
}