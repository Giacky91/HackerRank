import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void insertionSort(int[] ar) {
        int swi = 0;
        for(int x = 1; x < ar.length; x++) {
            int value = ar[x];
            int j = x - 1;
            while(j >= 0 && ar[j] > value) {
                ar[j + 1] = ar[j];
                j--;
                swi++;
            }
            ar[j + 1] = value;
        }
        System.out.println(swi);
    }
    
    public static void main(String[] args) {
		
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i = 0; i < n; i++) {
            ar[i] = in.nextInt();
        }
        insertionSort(ar);
    }
}