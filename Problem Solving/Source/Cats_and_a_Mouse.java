import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++) {
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            int diffA = Math.abs(z - x);
            int diffB = Math.abs(z - y);
            if(diffA == diffB) {
                System.out.println("Mouse C");
            } else
                System.out.println(diffA < diffB ? "Cat A" : "Cat B");
        }
    }
}