package jp.co.aforce.javaexample;

import java.util.ArrayList;
import java.util.List;

public class Kankouplogram0430 {

	public static void main(String[] args) {
		
		List<KankouDate> kankouDates = new ArrayList <KankouDate>();
		kankouDates.add(new KankouDate("東京", 1500000, 2500000));
		kankouDates.add(new KankouDate("大阪", 1200000, 1800000));
		kankouDates.add(new KankouDate("京都", 800000, 1200000));
		kankouDates.add(new KankouDate("福岡", 500000, 800000));
		kankouDates.add(new KankouDate("札幌", 400000, 600000));
		
		int total = 0;
		
		for(KankouDate date : kankouDates) {
			int subtotal =date.sum();
			total += subtotal;
		}
		
		System.out.println(total);
		

	}

}
