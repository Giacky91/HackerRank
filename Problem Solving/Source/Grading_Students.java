import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int solve(int n, int p) {

        //start from the page 1
        int leftRotate = p / 2;

        //transform the starting from n into starting from 0 or 1
        int rigthRotate = 0;
        int newP = n % 2 == 0 ? n - p + 1: n - p;
        rigthRotate = newP / 2;
        
        return leftRotate >= rigthRotate ? rigthRotate : leftRotate;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        System.out.println(result);
    }
}