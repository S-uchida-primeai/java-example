package jp.co.aforce.javaexample;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("整数を入力してください :");
		int number = scanner.nextInt();
		
		if(number % 2 == 0) {
			System.out.println("偶数");
		}else {
			System.out.println("奇数");
		}
	}


}
