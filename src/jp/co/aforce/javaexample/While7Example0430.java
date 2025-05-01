package jp.co.aforce.javaexample;

import java.util.ArrayList;
import java.util.List;

public class While7Example0430 {
	public static void main (String[]args) {
		
		//問題1(while)
		
		int i = 1;
		
		while (i <= 10) {
			System.out.println(i);
			i ++;
		}
		
		
		//問題2(while)
		
		int y =1;
		int sum = 0;
		
		while (y <= 100) {
			sum +=y;
			y ++;
		}
		System.out.println(sum);
		
		
		//問題3(while)
		/*
		Scanner scanner = new Scanner(System.in);
		System.out.println("0を入力してください");
		int j = 0 ;
		int total = 0;
		
		while ((j = scanner.nextInt()) != 0 ) {
			total += j;
		}
		System.out.println(total);
		*/
		
		//問題1(do-while)
		
		int a = 1;
		
		do {
			System.out.println(a);
			a ++;
		} while (a <= 10);
		
		
		//問題2(do-while)
		
		int b = 1;
		int sum2 = 0;
		
		do {
			sum2 += b;
			b ++;
		}while (b <= 100);
		
		System.out.println(sum);
		
		
		//問題3(do-while)
		
		/*Scanner scanner2 = new Scanner (System.in);
		System.out.println("整数を入力してください (0が入力されたら終了) :");
		int c = 0;
		int total2 = 0;
		
		do {
			total2 += c;
		}while ((c = scanner2.nextInt()) != 0);
		
		System.out.println(total2);
		*/
		
		//問題1(for)
		
		for (int d = 1; d <= 10; d ++) {
			System.out.println(d);
		}
		
		
		//問題2(for)
		
		int sum3 = 0;
		for (int e = 1; e <= 100; e ++) {
			sum3 += e;
		}
		System.out.println(sum3);
		
		
		//問題3(for)　　後で
		int number01 = 1;
		int number02 = 1;
		int number03 = number01 + number02;
		
		System.out.println(number01);
		System.out.println(number02);
		System.out.println(number03);
		
		for (int number04 = 3; number04 <= 9; number04 ++ ) {
			number01 = number02;
			number02 = number03;
			number03 = number01 + number02;
			System.out.println(number03);
		}
			
		
		//問題1(拡張for)
		
		Integer [] g = {1, 2, 3};
		
		for(int g2 : g) {
			System.out.println(g2);
		}
		
		
		
		//問題2(拡張for)
		
		ArrayList <String> employees = new ArrayList<>();
		employees.add("田中");
		employees.add("佐藤");
		employees.add("山田");
		
		for(String employee : employees) {
			System.out.println(employee);
		}
		
		//問題3(拡張for)
		
		Integer [] h = {2, 3, 4};
		int sum4 = 0;
		
		for (int h2 : h) {
			sum4 += h2;
			
		}
		System.out.println(sum4);
		
		
		//問題4(拡張for)
		
		int [] number2 = {1, 2, 3, 4, 5};
		
		for (int number3 : number2) {
			System.out.println(number3);
		}
		
		
		//問題5(拡張for)
		
		int [] number4 = {1, 2, 3, 4, 5};
		int sum5 = 0;
		
		for (int number5 : number4) {
			sum5 += number5; 
		}
		System.out.println(sum5);
		
		
		//問題6(拡張for)
		
		List <String> names = new ArrayList<>();
		names.add("Alice");
		names.add("Bob");
		names.add("Charlie");
		
		for (String name : names) {
			System.out.println(name);
		}
		
		
		//問題1(break)
		
		for(int k = 1; k <= 10; k ++) {
			System.out.println(k);
			if (k == 5) {				
				break;
			}
			
		}
		
		
		//問題2(break)
		
		int [] m = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		 for (int m2 : m) {
			 
			 if (m2 == 7) {
				 System.out.println(m2);
				 break;
				 
			 }
		 }
		 
		 
		 //問題3(break)
		 
		// int [] [] n = {{1, 2, 3}, {4, 5 , 6}};
		 
		 			 
		 }
		 
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

}
