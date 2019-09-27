/*
	Java Exercise:
		Name: Java Exception Handling [Easy].
		Link: https://www.hackerrank.com/challenges/java-exception-handling
*/

class MyCalculator {
    /*
    * Create the method long power(int, int) here.
    */
    public long power(int n, int p) throws Exception {
        if(n < 0 || p < 0)
            throw new Exception("n or p should not be negative.");
        else if(n == 0 && p == 0)
            throw new Exception("n and p should not be zero.");
        
        return (long) Math.pow(n, p);
    }
    
}