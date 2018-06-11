import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
   
        Scanner in = new Scanner(System.in);
        int day = in.nextInt();
        int month = in.nextInt();
        int year = in.nextInt();

        int dayExpected = in.nextInt();
        int monthExpected = in.nextInt();
        int yearExpected = in.nextInt();
        int total = 0;
        if(year - yearExpected > 0) {
            total = 10000;
        } else {
            if(year - yearExpected < 0) {
                total = 0;
            } else {
                if(month - monthExpected > 0 ) {
                    total = 500 * (month - monthExpected);
                } else {
                    if( day - dayExpected > 0) {
                        total = 15 * (day - dayExpected);
                    }
                }
            }
        }
        /*System.out.println( year - yearExpected > 0 ? 10000
							: month - monthExpected > 0 ? 500 * (month - monthExpected)
							: day - dayExpected > 0 ? 15 * (day - dayExpected)
							: 0);
		*/
        System.out.println(total);
    }
}