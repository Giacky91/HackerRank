import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String solve(int year) {
        int febDay = 0, day7month = 215;
        
        if(year >= 1919) {
            if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                febDay = 29;
            } else {
                febDay = 28;
            }
        } else {
            if( year == 1918) {
                febDay = 15;
            } else {
                if(year % 4 == 0) {
                    febDay = 29;
                } else {
                    febDay = 28;
                }
            }
        }
        int day = 256 - ( day7month + febDay);
        return day + ".09." + year;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
    }
}