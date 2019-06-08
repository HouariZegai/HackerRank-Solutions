/*
	Java Exercise:
		Name: Java String Reverse [Easy].
		Link: https://www.hackerrank.com/challenges/java-string-reverse/problem
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner mScanner = new Scanner(System.in);
        String A = mScanner.next();
        String rA = "";
        for(char c : A.toCharArray())
            rA = c + rA;
        
        System.out.println(rA.equals(A)? "Yes" : "No");
        
    }
}