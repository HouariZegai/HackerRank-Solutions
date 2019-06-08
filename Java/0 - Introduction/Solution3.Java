/*
	Java Exercise:
		Name: Java If-Else. [Easy]
		Link: https://www.hackerrank.com/challenges/java-if-else/problem
*/

import java.util.*;

public class Solution3 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();            
        String ans="";
        if(n%2==1 || (n >= 6 && n <= 20))
          ans = "Weird";
        else if(n >= 2 && n <= 100)
                ans = "Not Weird";
        
        System.out.println(ans);
        
    }
}
