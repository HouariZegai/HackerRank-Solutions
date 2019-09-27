/*
	Java Exercise:
		Name: Java End-of-file. [Easy]
		Link: https://www.hackerrank.com/challenges/java-end-of-file
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> strList = new LinkedList<>();
        String str;
        do {
            str = scanner.nextLine();
            strList.add(str);

            if(str.contains("end-of-file"))
                break;
        } while(scanner.hasNext());

        for(int i = 0; i < strList.size(); i++)
            System.out.println(i + 1 + " " + strList.get(i));
    }
}

