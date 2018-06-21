/******************************************************************************
 *  Compilation:  javac EuclideanDistance.java
 *  Execution:    java EuclideanDistance
 *  
 *  Prints the distance from (x, y) to the origin, where x and y
 *  are integers.
 * 
 *  % java Distance 3 4
 *  distance from (3, 4) to (0, 0) = 5.0
 *
 *  % java Distance 5 12
 *  distance from (5, 12) to (0, 0) = 13.0
 *
 *  % java Distance 2 1
 *  distance from (2, 1) to (0, 0) = 2.23606797749979
 *
 ******************************************************************************/

public class EuclideanDistance {
	public static void main(String[] args) {
		int startX = 0;
		int StartY = 0;
		int pointX = Integer.parseInt(args[0]);
		int pointY = Integer.parseInt(args[1]);

		double distance = Math.sqrt(Math.pow(pointX - startX, 2) + Math.pow(pointY - StartY, 2));

		System.out.println("The Euclidean Distance from (" + pointX + ", " + pointY + ") to (0, 0) is " + distance);
	}
}