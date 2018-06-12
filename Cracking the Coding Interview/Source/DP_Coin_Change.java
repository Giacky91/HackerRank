import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static long makeChange(int[] coins, int money) {
        long[] combinations = new long[money + 1];
        combinations[0] = 1;
        for(int coin : coins) {
            for(int amount = 1; amount < money + 1; amount++) {
                if( amount >= coin){
                    combinations[amount] += combinations[amount - coin];
                }
            }
        }
        return combinations[money];
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int coins[] = new int[m];
        for(int coins_i=0; coins_i < m; coins_i++) {
            coins[coins_i] = in.nextInt();
        }
        System.out.println(makeChange(coins, n));
    }
}