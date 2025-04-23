package jp.co.aforce.javaexample;

import java.util.ArrayList;
import java.util.List;

public class ChecknumberList {
	public static void main(String[]args) {
		List<String> numbersList = new ArrayList<String>(); 
		
		int score = 5;
		
		
		if( score >10) {
			numbersList.add("large");
			
		}else {
			numbersList.add("small");
		}
		System.out.println(numbersList);
		
	}

}
