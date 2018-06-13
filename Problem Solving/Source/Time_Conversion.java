import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
import java.util.regex.*;

public class Solution {

    static String timeConversion(String s) {
        int hh = Integer.parseInt(s.substring(0, 2));
        String m = s.substring(s.length() - 2, s.length());
        if(m.equals("AM") && hh == 12) return "00" + s.substring(2, s.length() - 2);
        if(m.equals("PM") && hh == 12) return s.substring(0, s.length() - 2);
        if(m.equals("AM")) return s.substring(0, s.length() - 2);
        if(m.equals("PM")) return (hh + 12) + s.substring(2, s.length() - 2);
        return "";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}