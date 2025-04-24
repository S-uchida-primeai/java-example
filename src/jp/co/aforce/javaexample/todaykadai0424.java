package jp.co.aforce.javaexample;

import java.util.ArrayList;

public class todaykadai0424 {

	public static void main(String[] args) {
		ArrayList<Integer> testScore = new ArrayList<>();
		
		testScore.add(85);
		testScore.add(92);
		testScore.add(78);
		testScore.add(65);
		testScore.add(98);
		testScore.add(70);
		
		int i = 0;
		
		for (Integer score : testScore) {
			if(score >= 70) {
				i++;
			}
		}
		
		System.out.println("70点以上の得点の数は" + i + "個です。");
	}

}
