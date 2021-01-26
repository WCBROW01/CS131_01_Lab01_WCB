/**
 * Library that handles basic math.
 * @author Will Brown
 * @version 1.0
 * Lab01 - BasicMath
 * Spring 2021
 */
public class BasicMath {

	/**
	 * Do not let the client instantiate this class.
	 */
	private BasicMath() {}
	
	/**
	 * @param a
	 * @param b
	 * @return the sum of a and b
	 */
	public static int add(int a, int b) {
		return a + b;
	}//end add
	
	/**
	 * @param a
	 * @param b
	 * @return the difference of a and b
	 */
	public static int subtract(int a, int b) {
		return a - b;
	}//end subtract
	
	/**
	 * @param a
	 * @param b
	 * @return the product of a and b
	 */
	public static int multiply(int a, int b) {
		return a * b;
	}//end multiply
	
	/**
	 * @param a
	 * @param b
	 * @return the quotient of a and b
	 */
	public static double divide(int a, int b) {
		return (double) a / b;
	}//end divide
	
}//end class
