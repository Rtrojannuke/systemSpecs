package arr_taker;

import java.util.Scanner;

public class arr_taker {
	public static void main(String[] args) {
		input_Taker mub = new input_Taker();
		String[] title = mub.titles_array();
		String[] categories = mub.categories_array();
		int size = mub.n;
		for(int i=0; i<size; i++) {
			System.out.println(title[i] + " ");
			for (int j =0; j<size; j++) {
				System.out.print(categories[j] + " ");
			}
		}
	
	}
	
	}
	
	
	
