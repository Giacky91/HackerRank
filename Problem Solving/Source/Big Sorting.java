import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static class MyComparator implements Comparator<String> {
    public int compare(String x, String y) {
		if (x.length() == y.length()) {
            return x.compareTo(y);
		}
		return x.length() - y.length();
		}
	}
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] unsorted = new String[n];
        for(int unsorted_i = 0; unsorted_i < n; unsorted_i++) {
            unsorted[unsorted_i] = in.next();
        }
        Arrays.sort(unsorted, new MyComparator());
        for(int sorted_i = 0; sorted_i < n; sorted_i++) {
            System.out.println(unsorted[sorted_i]);
        }
    }
}