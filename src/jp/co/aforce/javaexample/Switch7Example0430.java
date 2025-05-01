package jp.co.aforce.javaexample;

import java.util.Scanner;

public class Switch7Example0430 {
	public static void main(String[]args) {
		/*
		//問題3
		
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("曜日の番号を入力してください :");
		int dayNumber = scanner1.nextInt();
		String message;
		
		switch (dayNumber) {
			case 1 :
				message = ("月曜日");
				break;
				
			case 2 :
				message = ("火曜日");
				break;
				
			case 3 :
				message = ("水曜日");
				break;
				
			case 4 :
				message = ("木曜日");
				break;
				
			case 5 :
				message = ("金曜日");
				break;
				
			case 6 :
				message = ("土曜日");
				break;
				
			case 7 : 
				message = ("日曜日");
				break;
				
			default :
				message = ("正しく入力してください");
			
				
		}
		System.out.println(message);
		
		
		
		
		//問題4
		
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("月を入力してください(〇月) :");
		String month = scanner2.next();
		String monthEng = "month";
		
		switch (month) {
			case "1月":
				monthEng = ("January");
				break;
				
			case "2月" :
				monthEng = ("Februry");
				break;
				
			case "3月" :
				monthEng = ("March");
				break;
				
			case "4月" :
				monthEng = ("April");
				break;
				
			case "5月" :
				monthEng = ("May");
				break;
				
			case "6月" :
				monthEng = ("Jun");
				break;
				
			case "7月" :
				monthEng = ("July");
				break;
				
			case "8月" :
				monthEng = ("August");
				break;
				
			case "9月" :
				monthEng = ("September");
				break;
				
			case "10月" :
				monthEng = ("October");
				break;
				
			case "11月" :
				monthEng = ("November");
				break;
				
			case "12月" :
				monthEng = ("December");
				break;	
		
		}
		
		System.out.println(monthEng);
		
		
		*/
		//問題5
		
		Scanner scanner3 = new Scanner(System.in);
		System.out.println("成績を入力してください (A,B,C,D,F) :");
		String score = scanner3.next();
		String msg = " ";
		
		switch (score) {
			case "A":
				msg = ("Excellent");
				break;
				
			case "B":
				msg = ("Very Good");
				break;
				
			case "C":
				msg = ("Good");
				break;
				
			case "D":
				msg = ("Fair");
				break;
				
			case "F":
				msg = ("Poor");
				break;
				
			default:
				msg = ("No");
		
		}
		
		System.out.println(msg);
		
		
		
		
		
	}
	
	
	
	

}
