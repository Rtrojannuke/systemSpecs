package arr_taker;

import java.util.Scanner;

public class arr_taker {
	public static void main(String[] args) {
		input_Taker mub = new input_Taker();
		int size = mub.n;
		String[] title = mub.titles_array();
		String[] categories = mub.categories_array();
		
		for(int i=0; i<size; i++) {
			System.out.print(title[i] + " ");
		}
	
	}
	
	}
	
	
	
