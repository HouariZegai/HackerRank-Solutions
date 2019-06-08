/*
	Java Exercise:
		Name: Java Strings Introduction [Easy].
		Link: https://www.hackerrank.com/challenges/java-strings-introduction/problem
*/

import java.io.*;
import java.util.*;

public class Solution1 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length() + B.length());
        System.out.println((A.charAt(0) > B.charAt(0))? "Yes" : "No");
        System.out.println((A.charAt(0) + "").toUpperCase() + A.substring(1) + " " + (B.charAt(0) + "").toUpperCase() + B.substring(1));
    }
}