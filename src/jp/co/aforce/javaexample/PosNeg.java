package jp.co.aforce.javaexample;

import java.util.Scanner;

public class PosNeg {
	public static void main (String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("整数を入れてください : ");
		int number = scanner.nextInt();
		
		if(number >= 0) {
			System.out.println("正の数");
			
		}else {
			System.out.println("負の数");
		}
	}

}
