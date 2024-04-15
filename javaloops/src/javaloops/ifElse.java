package javaloops;

public class ifElse {

	public static void main(String[] args) {
		
		// 1st example
		int age = 22;
		if (age > 45) {
			  System.out.println("Senior");
			} else if (age > 18 && age < 45) {
			  System.out.println("Adult.");
			} else {
			  System.out.println("junior");
			}

		
		// 2nd example
		int x = 30;
	      if( x < 20 ) {
	         System.out.print("This is if statement");
	      }else {
	         System.out.print("This is else statement");
	      }
	}

}
