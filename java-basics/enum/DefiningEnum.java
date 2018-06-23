/******************************************************************************
 *  Compilation:  javac DefiningEnum.java
 *  Execution:    java DefiningEnum
 *
 *  Defining a enum and invoking its constructor method.
 *	
 *  % java DefiningEnum  
 *  The shortcode of EAST: 
 *  E
 *  
 ******************************************************************************/

enum Directions {
	EAST ("E"),
	WEST ("W"),
	NORTH ("N"),
	SOUTH ("S");

	private final String shortCode;

	Directions (String shortCode) {
		this.shortCode = shortCode;
	}

	public String getShortCode() {
		return this.shortCode;
	}
}

class DefiningEnum {
	public static void main(String[] args) {
		Directions direction = Directions.EAST;

		System.out.println("The shortcode of EAST: ");
		System.out.println(direction.getShortCode());
	}
}