/*
	Java Exercise:
		Name: Pattern Syntax Checker [Easy].
		Link: https://www.hackerrank.com/challenges/pattern-syntax-checker/problem
*/

import java.util.Scanner;
import java.util.regex.*;

public class Solution6 {
	
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      
      while(testCases > 0) {
         String pattern = in.nextLine();
          try {   
			Pattern pat = Pattern.compile(pattern);
			System.out.println("Valid");
          } catch(PatternSyntaxException pse) {
              System.out.println("Invalid");
          }
      }
   }
}