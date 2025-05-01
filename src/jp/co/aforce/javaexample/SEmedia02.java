package jp.co.aforce.javaexample;

import java.util.Random;
import java.util.Scanner;

public class SEmedia02 {

	public static void main(String[] args) {
		
		//問題1
		/*
		Scanner scanner1 = new Scanner (System.in);
		System.out.println("年齢を整数で入力してください");
		int age = scanner1.nextInt();
		
		if (age < 6 || age >= 75) {
			System.out.println(age + "歳のお客様の入場料は無料です");
			
		}else if (age >= 6 && age < 12) {
			System.out.println(age + "歳のお客様の入場料は500円です");
			
		}else {
			System.out.println(age + "歳のお客様の入場料は1000円です");
		}
		
		
		
		
		//問題2
		
		String season= " ";
		Scanner scanner01 = new Scanner (System.in);
		System.out.println("月を整数で入力してください");
		int month = scanner01.nextInt();
		
		if ( month > 2 && month <=5) {
			season = "春";
			
		}else if (month > 5 && month <= 8) {
			season = "夏";
			
		}else if (month > 8 && month <= 11) {
			season = "秋";
			
		}else {
			season = "冬";
		}
		System.out.println("日本の" + month + "月は、" + season + "です。");
		
		
		
		
		
		//問題3
		
		Scanner scanner001 = new Scanner (System.in);
		System.out.println("1~12の範囲で月を入力してください");
		String month01 = scanner001.next();
		
		String season01 = "";
		switch (month01) {
			case "1":
			case "2":
			case "12":
				season01 = "冬";
				break;
			
			case "3":
			case "4":
			case "5":
				season01 = "春";
				break;
				
				
			case "6":
			case "7":
			case "8":
				season01 = "夏";
				break;
				
			case "9":
			case "10":
			case "11":
				season01 = "秋";
				break;
				
		}
		System.out.println("日本の" + month01 + "月は、" + season01 + "です。");
		
		*/
		
		//問題4 あとで
		
		System.out.println("じゃんけんゲーム始めるよー");
		System.out.println("PCとの勝負です");
		
		Scanner scanner0001 = new Scanner (System.in);
		System.out.println("あたなの手の数字を入力してください");
		System.out.println("0:ぐー 1:ちょき 2:ぱー");
		int jankenn01 = scanner0001.nextInt();
		
		Random rdm = new Random();
		int pc01 = rdm.nextInt(3);
		
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
