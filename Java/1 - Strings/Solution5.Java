/*
	Java Exercise:
		Name: Java Anagrams [Easy].
		Link: https://www.hackerrank.com/challenges/java-anagrams
*/

import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if(a.length() != b.length())
            return false;
        
        if(a.equalsIgnoreCase(b))
            return true;

        a = a.toLowerCase();
        b = b.toLowerCase();
        int n = a.length();

        // test frequence of letters
        char targetChar;
        int freqA, freqB;
        
        for(int i = 0; i < n; i++) {
            freqA = 0;
            freqB = 0;
            targetChar = a.charAt(i);
            for(int j = 0; j < n; j++) {
                if(a.charAt(j) == targetChar)
                    freqA++;
                
                if(b.charAt(j) == targetChar)
                    freqB++;
            }

            if(freqA != freqB) {
                return false;
            }
        }
        return true;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
