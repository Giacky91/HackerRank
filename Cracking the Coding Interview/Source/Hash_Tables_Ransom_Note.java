import java.util.*;

public class Solution {
    Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;
    
    public Solution(String magazine, String note) {
        magazineMap = new HashMap<String, Integer>();
        noteMap = new HashMap<String, Integer>();
        int occurrencies = 1;
        for(String magWord : magazine.split("\\s+")) {
            if(magazineMap.containsKey(magWord))
                occurrencies += magazineMap.get(magWord);
            magazineMap.put(magWord, occurrencies);
            occurrencies = 1;
        }
        
        for(String noteWord : note.split("\\s+")) {
            if(noteMap.containsKey(noteWord))
                occurrencies += noteMap.get(noteWord);
            noteMap.put(noteWord, occurrencies);
            occurrencies = 1;
        }
    }
    
    public boolean solve() {
        Boolean result = true;
        for(String noteWord : noteMap.keySet()) {
            if(!magazineMap.containsKey(noteWord)) {
                result = false;
                break;
            }
            if(noteMap.get(noteWord) > magazineMap.get(noteWord))
                result = false;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        scanner.nextLine();
        
        Solution s = new Solution(scanner.nextLine(), scanner.nextLine());
        scanner.close();
        
        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else 
			System.out.println("No");
    }
}