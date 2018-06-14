import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void insertIntoSorted(int[] ar) {
        int unso = ar[ar.length - 1];
        boolean stop = false;
        int index = ar.length - 2;
        while(!stop && index >= 0){
            if( ar[index] > unso){
                ar[index + 1] = ar[index];
                printAr(ar);
                index--;
            } else {
                stop = true;
            }
        }
        ar[index + 1] = unso;
        printAr(ar);
    }
    
    public static void printAr(int[] ar) {
        for(int x =  0; x < ar.length; x++)
            System.out.print(ar[x] + " ");
        System.out.println("");
    }
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i = 0; i < s; i++) {
            ar[i] = in.nextInt(); 
        }
        insertIntoSorted(ar);
    }
    
    private static void printArray(int[] ar) {
        for(int n: ar) {
            System.out.print(n+" ");
        }
        System.out.println("");
    }
}