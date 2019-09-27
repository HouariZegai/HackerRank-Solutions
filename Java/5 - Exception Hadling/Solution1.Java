/*
	Java Exercise:
		Name: Java Exception Handling (Try-catch) [Easy].
		Link: https://www.hackerrank.com/challenges/java-exception-handling-try-catch
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner mScanner = new Scanner(System.in);
        try {
        int x = mScanner.nextInt();
        int y = mScanner.nextInt();
        System.out.println(x / y);
        } catch(InputMismatchException ime) {
            System.out.println("java.util.InputMismatchException");
        } catch(ArithmeticException ae) {
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
    }
}