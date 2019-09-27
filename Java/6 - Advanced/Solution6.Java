/*
	Java Exercise:
		Name: Java Singleton Pattern [Easy].
		Link: https://www.hackerrank.com/challenges/java-singleton
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;


class Singleton{
    public static String str;
    private static Singleton instance;
    private Singleton() {
    }
    
    public static Singleton getSingleInstance() {
        if(instance == null)
            instance = new Singleton();
        
        return instance;
    }
}