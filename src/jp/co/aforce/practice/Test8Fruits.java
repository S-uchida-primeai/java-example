package jp.co.aforce.practice;

import java.util.ArrayList;

public class Test8Fruits {

	public static void main(String[] args) {
		
		ArrayList<String> fruitsList = new ArrayList<String>();
		
		fruitsList.add("リンゴ");
		fruitsList.add("バナナ");
		fruitsList.add("さくらんぼ");
		
		fruitsList.remove(1);
		
		fruitsList.add("オレンジ");
		
		System.out.println(fruitsList);

	}

}
