/*
	Java Exercise:
		Name: Java Static Initializer Block. [Easy]
		Link: https://www.hackerrank.com/challenges/java-static-initializer-block
*/

public class Solution {

	public static void main(String[] args) {
		static Scanner scanner = new Scanner(System.in);
		static int B, H;
		static boolean flag;

		static {
		    try {
		        B = scanner.nextInt();
		        H = scanner.nextInt();
		        if(H <= 0 || B <= 0)
		            throw new Exception("Breadth and height must be positive");

		        flag = true;
		    } catch(Exception e) {
		        System.out.println(e);
		    }
		}

	}
}