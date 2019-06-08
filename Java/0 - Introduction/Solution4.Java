/*
	Java Exercise:
		Name: Java Stdin and Stdout II. [Easy]
		Link: https://www.hackerrank.com/challenges/java-stdin-stdout/problem
*/

import java.util.Scanner;

public class Solution4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();
        
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}

