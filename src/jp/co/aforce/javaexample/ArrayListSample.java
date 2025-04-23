package jp.co.aforce.javaexample;

import java.util.ArrayList;
import java.util.List;


public class ArrayListSample {
	public static void main (String[]args) {
		List<String> fruitsList = new ArrayList<String>();
		fruitsList.add("appele");
		fruitsList.add("potato");
		fruitsList.add( "grape");
		fruitsList.add("peach");
		fruitsList.remove(1);
		fruitsList.remove("peach");
		
		System.out.println(fruitsList);
	}
	

}

