import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int viralAdvertising(int n) {
        int total = 0, people = 5, interested = 0;
        while(n > 0) {
            interested = people / 2;
            people = interested * 3;
            total += interested;
            n--;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = viralAdvertising(n);
        System.out.println(result);
        in.close();
    }
}