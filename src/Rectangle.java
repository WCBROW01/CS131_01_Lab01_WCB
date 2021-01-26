/**
 * Rectangle class. Provides methods for calculating area and perimeter.
 * @author Will Brown
 * @version 1.0
 * Lab01 - Rectangle
 * Spring 2021
 */
public class Rectangle {

	private int length;
	private int width;
	
	/**
	 * Passing no parameters sets length and width to 1.
	 */
	public Rectangle() {
		length = 1;
		width = 1;
	}//end empty argument constructor

	/**
	 * Set length and width to the given values.
	 * @param length the length of the rectangle
	 * @param width the width of the rectangle
	 */
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}//end length/width constructor
	
	/**
	 * @return the area of the rectangle
	 */
	public int calculateArea() {
		return length * width;
	}//end calculateArea
	
	/**
	 * @return the perimeter of the rectangle
	 */
	public int calculatePerimeter() {
		return 2 * length + 2 * width;
	}//end calculatePerimeter
	
	/**
	 * @return the length of the rectangle
	 */
	public int getLength() {
		return length;
	}//end getLength
	
	/**
	 * @return the width of the rectangle
	 */
	public int getWidth() {
		return width;
	}//end getWidth
	
}//end class
