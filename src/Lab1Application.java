/**
 * Lab 1 test application, tests all classes.
 * @author Will Brown
 * @version 1.0
 * Lab01 - Application
 * Spring 2021
 */
public class Lab1Application {

	/**
	 * Main Method
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Starting Rectangle tests...");
		
		Rectangle rectangle1 = new Rectangle(5,17);
		System.out.println(rectangle1.calculateArea()==85 ? "Area test 1 succeeded!" : "Area test 1 failed.");
		
		Rectangle rectangle2 = new Rectangle(19,32);
		System.out.println(rectangle2.calculateArea()==608 ? "Area test 2 succeeded!" : "Area test 2 failed.");
		System.out.println(rectangle2.calculatePerimeter()==102 ? "Perimeter test 1 succeeded!" : "Perimeter test 1 failed.");
		
		Rectangle rectangle3 = new Rectangle(12,15);
		System.out.println(rectangle3.calculatePerimeter()==54 ? "Perimeter test 2 succeeded!" : "Perimeter test 2 failed.");
		
		Rectangle rectangle4 = new Rectangle();
		System.out.println(rectangle4.getLength()==1 && rectangle4.getWidth()==1 ? "Empty argument constructor test succeeded!" : "Empty argument constructor test failed.");
		
		Rectangle rectangle5 = new Rectangle(10,20);
		System.out.println(rectangle5.getLength()==10 && rectangle5.getWidth()==20 ? "Preferred constructor test succeeded!" : "Preferred constructor test failed.");
		
		System.out.println("Rectangle tests complete!");
		System.out.println();
		
		System.out.println("Starting DistanceCalculator tests...");
		
		double distanceCalculatorTest1 = DistanceCalculator.calculateDistance(5, 5, 5, 5);
		System.out.println(distanceCalculatorTest1==0 ? "Test 1 succeeded!" : "Test 1 failed.");
		
		double distanceCalculatorTest2 = DistanceCalculator.calculateDistance(4, 7, 3, 9);
		System.out.println(distanceCalculatorTest2==2.23606797749979 ? "Test 2 succeeded!" : "Test 2 failed.");
		
		double distanceCalculatorTest3 = DistanceCalculator.calculateDistance(8, 0, -10, -4);
		System.out.println(distanceCalculatorTest3==18.439088914585774 ? "Test 3 succeeded!" : "Test 3 failed.");
		
		System.out.println("DistanceCalculator tests complete!");
		System.out.println();
		
		System.out.println("Starting BasicMath tests...");
		
		int basicMathTest1 = BasicMath.add(3, 4);
		System.out.println(basicMathTest1==7 ? "Test 1 succeeded!" : "Test 1 failed.");
		
		int basicMathTest2 = BasicMath.subtract(3, 4);
		System.out.println(basicMathTest2==-1 ? "Test 2 succeeded!" : "Test 2 failed.");
		
		int basicMathTest3 = BasicMath.multiply(3, 4);
		System.out.println(basicMathTest3==12 ? "Test 3 succeeded!" : "Test 3 failed.");
		
		double basicMathTest4 = BasicMath.divide(3, 4);
		System.out.println(basicMathTest4==.75 ? "Test 4 succeeded!" : "Test 4 failed.");
		
		System.out.println("DistanceCalculator tests complete!");
		System.out.println();
		
		System.out.println("Starting LeapYears tests...");
		
		DateManipulator dm = new DateManipulator();
		System.out.println(dm.isLeapYear(1600) ? "Test 1 succeeded!" : "Test 1 failed.");
		System.out.println(!dm.isLeapYear(1900) ? "Test 2 succeeded!" : "Test 2 failed.");
		System.out.println(!dm.isLeapYear(1574) ? "Test 3 succeeded!" : "Test 3 failed.");
		System.out.println(dm.isLeapYear(2060) ? "Test 4 succeeded!" : "Test 4 failed.");
		System.out.println(!dm.isLeapYear(2100) ? "Test 5 succeeded!" : "Test 5 failed.");
		System.out.println(dm.isLeapYear(2400) ? "Test 6 succeeded!" : "Test 6 failed.");
		
		System.out.println("LeapTears tests complete!");
		System.out.println("Unit tests are now over.");
	}

}
