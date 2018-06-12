import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    private static HashMap<String, Integer> cList = new HashMap<String, Integer>();
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++) {
            String op = in.next();
            String contact = in.next();
            if(op.equals("add"))
                add(contact);
            if(op.equals("find"))
                find(contact);
        }
    }
    
    private static void add(String contact) {
        for(int x = 0; x <= contact.length(); x++) {
            String tok = contact.substring(0, x);
            if(cList.containsKey(tok)) {
                int val = cList.get(tok) + 1;
                cList.put(tok, val);
            }else{
                cList.put(tok, 1);
            }
        }
    }
    
    private static void find(String contact) {
        if(cList.containsKey(contact))
            System.out.println(cList.get(contact));
        else
            System.out.println(0);
    } 
}