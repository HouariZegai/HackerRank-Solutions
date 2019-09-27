/*
	Java Exercise:
		Name: Java Generics [Easy].
		Link: https://www.hackerrank.com/challenges/java-generics
*/


import java.io.IOException;
import java.lang.reflect.Method;

// Start solution
class Printer<T> {
   public void printArray(T[] arrayT) {
        for(int i = 0; i < arrayT.length; i++)
            System.out.println(arrayT[i]);
   }
}
// End solution

public class Solution9 {


    public static void main( String args[] ) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");
      
    }
}