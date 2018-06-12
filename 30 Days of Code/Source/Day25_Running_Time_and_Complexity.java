import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void prime(int n) {
        Boolean prime = true;
        int div = 2;
        if( n == 1) prime = false;
        while( prime && div * div <= n){
            if(n % div == 0){
                prime = false;
            }
            div++;
        }
        
        if(prime)
            System.out.println("Prime");
        else
            System.out.println("Not prime");
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int z = 0; z < t; z++) {
            prime(in.nextInt());
        }
    }
}