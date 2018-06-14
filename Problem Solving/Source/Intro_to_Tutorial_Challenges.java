import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int V = in.nextInt();
        int n = in.nextInt();
        for(int x = 0; x < n; x++)
            if(in.nextInt() == V)
				System.out.println(x);
    }
}