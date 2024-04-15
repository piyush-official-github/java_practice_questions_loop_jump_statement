package javaloops;

public class jumpstatement {

	public static void main(String[] args) {
		
		// break statement
		// 1st example
		for (int i = 0; i <= 10; i++) {
			if(i==5) break;
			  System.out.print(i+" ");
			}
		System.out.println();
		
		// 2nd example
		for (int i = 1; i <= 10; i++) {
			if(i==4) break;
			  System.out.print(i+" ");
			}
		System.out.println();
		
		// continue statement
		// 1st example
		for (int i = 0; i <= 10; i++) {
			if(i==3 || i==5 || i==7) continue;
			  System.out.print(i+" ");
			}
		System.out.println();
		
		// 2nd example
		for (int i = 0; i <= 10; i++) {
			if(i==2 || i==4 || i==6) continue;
			  System.out.print(i+" ");
			}
		System.out.println();
	}

}
