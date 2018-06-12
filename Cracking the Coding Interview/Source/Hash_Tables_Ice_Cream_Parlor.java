import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class IceCream implements Comparable{
    int flavor;
    int index;

    public IceCream(int flavor, int index) {
        this.flavor = flavor;
        this.index = index;
    }
	
    public int compareInt(int o){
        return (int)(this.flavor - o);
    }
	
    @Override
    public int compareTo(Object o) {
        return (int)(this.flavor - ((IceCream)o).flavor);
    }
	
    @Override
    public boolean equals(Object o){
       return (this.flavor == (int)o) ? true : false;
    }
}

public class Solution {
   
    public static int binarySearch(int first, int last, IceCream[] arr, int search) {
        if(first <= last) {
            int mid = (int)(first + last) / 2;
            if(arr[mid].equals(search))
				return arr[mid].index;

            if(arr[mid].compareInt(search) > 0)
                return binarySearch(first, mid - 1, arr, search);
            else
                return binarySearch(mid + 1, last, arr, search);
        }
        else
            if(first == last && arr[first].equals(search))
                return arr[first].index;
            else
                return -1;
    }

    public static void main(String[] args) {
        int trips;
        int flavour, money;
 
        Scanner in = new Scanner(System.in);
        trips = in.nextInt();
       for(int test = 0; test < trips; test++) {       
            
            money = in.nextInt();
            flavour = in.nextInt(); 
            IceCream[] arr = new IceCream[flavour];
    
            for (int i = 0; i < flavour; i++)
                arr[i] = new IceCream(in.nextInt(), i + 1);
            
            Arrays.sort(arr);
            int firstIndex = 100000, secondIndex = 100000;
            for(int i = 0; i < flavour - 1; i++) {
                int search = money - arr[i].flavor;
                if(search >= arr[i].flavor) {
                    int index = binarySearch( i + 1, flavour - 1, arr, search);
                    if( index != -1 ) {
                        System.out.println( Math.min(arr[i].index, index) + " " + Math.max(arr[i].index, index));
                        break;
                    }
                }
            }
        }
    }
}