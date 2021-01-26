/**
 * Calculates the distance between two points on a coordinate plane
 * @author Will Brown
 * @version 1.0
 * Lab01 - DistanceCalculator
 * Spring 2021
 */
public class DistanceCalculator {

	/**
	 * Does nothing.
	 */
	private DistanceCalculator() {
		// nothing here
	}//end empty argument constructor
	
	/**
	 * @param x the x value of the first point
	 * @param y the y value of the first point
	 * @param a the x value of the second point
	 * @param b the y value of the second point
	 * @return the distance between the two points
	 */
	public static double calculateDistance(int x, int y, int a, int b) {
		return Math.sqrt(Math.pow(a - x, 2) + Math.pow(b - y, 2));
	}//end calculateDistance
	
}//end class