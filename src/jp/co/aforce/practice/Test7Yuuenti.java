package jp.co.aforce.practice;

import java.util.Scanner;

public class Test7Yuuenti {

	public static void main(String[] args) {
		
		/**
		 * int age  年齢
		 * int fee  入場料
		 */
		
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("年齢を入力してください :");
		int age = scanner.nextInt();
		
		int fee = 0;
		
		if(age <= 3) {
			
			fee = 0;			
		} else if (age >= 4 && age < 13) {
			
			fee = 500;
			
			
		} else if (age >= 13 && age < 18) {
			
			fee = 800;
			
		} else if (age >=18 && age < 60) {
			
			fee = 1200;
			
		} else if (age >= 60 && age < 200) {
			
			fee = 700;
			
		} else if (age < 0 || age >= 200) {
			
			System.out.println("エラー");
			
		}
		
		System.out.println("あなたは" + age + "歳なので入場料は" + fee + "円です。");
		

	}

}
