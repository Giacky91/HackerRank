import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int findCombination(int n) {
        //1 - 2 - 3
        int[] array = new int[n];
        if(n == 1)
            return 1;
        if(n == 2)
            return 2;
        if(n == 3)
            return 4;
        array[0] = 1;
        array[1] = 2;
        array[2] = 4;
        for(int i = 3; i < n; i++) {
            array[i] = array[i - 1] + array[i - 2] + array[i - 3];
        }
        return array[n-1];
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        for(int a0 = 0; a0 < s; a0++) {
            int n = in.nextInt();
            System.out.println(findCombination(n));
        }
    }
}