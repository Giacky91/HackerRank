import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    private static void median(List<Integer> da) {
        double median = 0f;
        if(da.size() % 2 == 1) //odd
            median = da.get(da.size() / 2);
        else{ //even
            int mid = da.size() / 2;
            median = (da.get(mid - 1) + da.get(mid)) / 2.0;
        }
        System.out.format("%1$.1f\n", median);
    }
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a;
        List<Integer> data = new ArrayList<>();
        for(int a_i=0; a_i < n; a_i++){
            a = in.nextInt();
            int pos = Collections.binarySearch(data, a);
            if(pos < 0){
                pos = Math.abs(pos) - 1;
            }
            data.add(pos, a);
            median(data);
        }
    }
}