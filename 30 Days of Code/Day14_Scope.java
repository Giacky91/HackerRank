import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;
    public Difference(int[] elements){
        this.elements = elements;
    }

    public void computeDifference(){
        this.maximumDifference = 0;
        for(int x = 0; x < this.elements.length - 1; x++){
            for(int y = x; y < this.elements.length; y++)
                if(Math.abs(this.elements[x] - this.elements[y]) > this.maximumDifference)
                    this.maximumDifference = Math.abs(this.elements[x] - this.elements[y]);
        }
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}