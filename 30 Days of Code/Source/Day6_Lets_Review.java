import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int x = 0; x < n; x++){
            String text = sc.next();
            String[] ch = {"",""};
			
            for(int z = 0; z < text.length(); z++){
                if(z % 2 == 0){
                    ch[0] += text.charAt(z);
                } else {
                    ch[1] += text.charAt(z);
                }
            }
            System.out.println(ch[0] + " " + ch[1]);
        }
    }
}