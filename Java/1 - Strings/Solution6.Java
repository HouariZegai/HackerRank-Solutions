/*
	Java Exercise:
		Name: Java String Tokens [Easy].
		Link: https://www.hackerrank.com/challenges/java-string-tokens
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String[] tokens = s.split("[ !,?._'@]+");
        
        List<String> tokensList = new LinkedList<>();
        for(String str : tokens)
            if(!str.isEmpty())
                tokensList.add(str);

        System.out.println(tokensList.size());
        for(String str : tokensList)
            System.out.println(str);
        
        scan.close();
    }
}