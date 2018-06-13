import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int z = 0;
        StringBuilder a = new StringBuilder(n);
        for( int x = 0; x < n; x++)
            a.append(" ");
        int j = 0;
        for( int x = 1; x <= n; x++) {
            a.replace(a.length() - x, a.length() - j, "#");
            j++;
            System.out.println(a.toString());
        }
    }
}