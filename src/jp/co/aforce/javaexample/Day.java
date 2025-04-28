package jp.co.aforce.javaexample;

import java.util.Scanner;

public class Day {
	public static void main(String[]args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("曜日を入れてください :");
		int day = scanner.nextInt();
		
		switch (day) {
		case 1 :
			System.out.println("月曜日です");
			break;
			
		case 2 :
			System.out.println("火曜です");
			break;
			
		case 3 :
			System.out.println("水曜日です");
			break;
			
		case 4 :
			System.out.println("木曜日です");
					
			break;
			
		case 5 :
			System.out.println("金曜日です");
			break;
			
		case 6 :
			System.out.println("土曜日です");
			break;
			
		case 7 :
			System.out.println("日曜日です");
			break;	
			
			
		
		}
	}

}
