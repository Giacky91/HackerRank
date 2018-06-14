import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String steps = in.next();
        int valleyCount = 0, tmp = 0;
        for(char s : steps.toCharArray()) {
            if(s == 'U') tmp++;
            if(s == 'D') tmp--;
            if(s == 'U' && tmp == 0) valleyCount++;
        }
        System.out.println(valleyCount);
    }
}