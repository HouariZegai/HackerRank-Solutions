/*
	Java Exercise:
		Name: Java Output Formatting. [Easy]
		Link: https://www.hackerrank.com/challenges/java-output-formatting/problem
*/

import java.util.Scanner;

public class Solution5 {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                
                for(int j = s1.length(); j < 15; j++)
                    s1 += " ";
                
                if (x < 10)
                    System.out.println(s1 + "00" + x);
                else if (x < 100)
                    System.out.println(s1 + "0" + x);
                else
                    System.out.println(s1 + x);
            }
            System.out.println("================================");

    }
}