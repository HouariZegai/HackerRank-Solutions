/*
	Java Exercise:
		Name: Java Substring [Easy].
		Link: https://www.hackerrank.com/challenges/java-substring/problem
*/

import java.util.Scanner;
import java.util.regex.*;

public class Solution1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        if(start < 0 || start >= end || !S.matches("[a-zA-Z]{1,100}"))
            return;
        
        System.out.println(S.substring(start, end));
    }
}