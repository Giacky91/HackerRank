import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        for(int a0 = 0; a0 < p; a0++) {
            int n = in.nextInt();
            int half = (int)Math.sqrt(n);
            Boolean prime = true;
            if(n == 1)
				System.out.println("Not prime");
            else {
                while(half > 1 && prime) {
                    if(n % half == 0) {
                        prime = false;
                    }
                    half--;
                }
                System.out.println(prime ? "Prime" : "Not prime");
            }
        }
    }
}