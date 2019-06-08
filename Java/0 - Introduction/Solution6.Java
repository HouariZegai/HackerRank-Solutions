/*
	Java Exercise:
		Name: Java Loops I. [Easy]
		Link: https://www.hackerrank.com/challenges/java-loops-i/problem
*/

import java.io.*;
import java.util.*;

public class Solution6 {

    public static void main(String[] args) {
        Scanner mScanner = new Scanner(System.in);
        int n = mScanner.nextInt();
        for(int i = 1; i < 11; i++)
            System.out.println(n + " x " + i  + " = " + n*i);
        mScanner.close();
    }
}