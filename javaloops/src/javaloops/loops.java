package javaloops;

public class loops {

	public static void main(String[] args) {
		
		// for loop
		// 1st example
		for (int i = 0; i <= 10; i = i + 2) {
			  System.out.print(i+" ");
			}
		System.out.println();
		
		//2nd example
		for (int i = 10; i >= 0; i=i-2) {
			  System.out.print(i+" ");
			}
		System.out.println();
		
		
		
		// while loop
		// 1st example
		int i=0;
		while(i<=10) {
			  System.out.print(i+" ");
			  i+=2;
		}
		System.out.println();
		
		// 2nd example
		i=10;
		while(i>=0) {
			  System.out.print(i+" ");
			  i-=2;
		}
		System.out.println();
			
		// do while
		// 1st example
		int k=0;
		do{
			  System.out.print(k+" ");
			  k+=2;
		}while(k<=10);
		
		System.out.println();
		
	     k=10;
		do{
			  System.out.print(k+" ");
			  k-=2;
		}while(k>=0);
		
		System.out.println();
		
	// for each
		// 1st example
		int arr[] = { 0, 2, 4, 6, 8 , 10}; 
		  
        for (int element : arr) 
  
            System.out.print(element + " "); 
    
        System.out.println();
        
		int arr1[] = { 0, 2, 4, 6, 8 , 10}; 
		  for (int element : arr1) 
			  
	            System.out.print(element+2 + " "); 
}
	}
