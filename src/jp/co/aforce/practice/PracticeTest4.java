package jp.co.aforce.practice;

import java.util.ArrayList;

public class PracticeTest4 {
	public static void main(String[]args) {
		
		//問題2
		ArrayList<String> animalsList = new ArrayList<String>();
		
		animalsList.add("犬");
		animalsList.add("猫");
		animalsList.add("うさぎ");
		animalsList.add("へび");
		
		
		//問題3
		String element1 = animalsList.get(0);
		String likeAnimal ="犬";
		
		if(element1 == likeAnimal) {
			
			System.out.println(likeAnimal + "はリストに含まれています");
			
		}else {
			System.out.println(likeAnimal + "はリストに含まれていません");
		}
		
		
		//問題4
		
		
	}

}
