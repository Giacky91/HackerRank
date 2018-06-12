import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int remainder = 0, maxOne = 0, currentOne = 0;
        String binary = "";
        while(n > 0){
            remainder = n % 2;
            if(remainder == 1){
                currentOne++;
                if(maxOne < currentOne)
                    maxOne = currentOne;
            } else {
                currentOne = 0;
            }
            n = n / 2;
        }
        System.out.println(maxOne);
    }
}