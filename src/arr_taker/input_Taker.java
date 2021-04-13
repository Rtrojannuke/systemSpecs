package arr_taker;

import java.util.Scanner;

public class input_Taker {
	//Variable to determine the size of the array to be taken in 
	public int n;
	Scanner pen = new Scanner(System.in);
	
	public String[] titles_array(){

		System.out.print("Enter the size of array: ");
		n = pen.nextInt();
		System.out.println(n);
		
		String[] title_category = new String[n];
		for(int i =0; i<n; i++) {
			System.out.print("Enter first array value: ");
			title_category[i] = pen.next();
		}
		return title_category;
		
	}
	public String[] categories_array() {
		String[] category_array = new String[n];
		for(int j = 0; j<n; j++) {
			System.out.print("Enter second array value: ");
			category_array[j] = pen.next();
		}
		return category_array;
	}
}