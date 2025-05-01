package jp.co.aforce.javaexample;

import java.util.Scanner;

public class if7Example0430 {
	
	public static void main (String[]args) {
		
		//問題1
		
		Scanner scanner1 = new Scanner (System.in);
		System.out.println("number :");
		int i = scanner1.nextInt();
		
		if (i % 2 == 0) {
			System.out.println("偶数");
		}else {
			System.out.println("奇数");
		}
		
		
		//問題2
		
		Scanner scanner2 = new Scanner (System.in);
		System.out.println("number :");
		int y = scanner2.nextInt();
		
		if(y >= 0) {
			System.out.println("正の数");
		}else {
			System.out.println("負の数");
		}
		
		
		//問題3
		
		Scanner scanner3 = new Scanner (System.in);
		System.out.println("辺の長さを3つ入力してください :");
		int a = scanner3.nextInt();
		int b = scanner3.nextInt();
		int c = scanner3.nextInt();
		
		if(a + b > c && a + c > b && b + c >a) {
			System.out.println("有効");
		}else {
			System.out.println("無効");
		}
		
		
		//問題4
		
		Scanner scanner4 = new Scanner(System.in);
		System.out.println("年齢を入力してください :");
		int age = scanner4.nextInt();
		
		if (age <= 12) {
			System.out.println("入場料は無料です");
		}else if (age < 60) {
			System.out.println("入場料は1000円です");
		}else if (age >= 60) {
			System.out.println("入場料は500円です");
		}else {
			System.out.println("無効です");
		}
		
		
		
		
		
		
	}

}
