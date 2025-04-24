package jp.co.aforce.javaexample;

import java.util.ArrayList;

public class whilepractice {
	public static void main (String[]args) {
		//while文練習
		int i = 3;
		while (i < 5) {
			System.out.println("iの値:" + i);
			i ++;
		}
		
		//do-while文練習
		i = 0;
		do {
			System.out.println("iの値 :" + i);
			i ++;
			
		} while (i < 5); 
		
		/*do-while文②*/
		i = 5; 
		do {
			System.out.println("iの値 :" + i);
			i ++;
		} while(i < 5);
		
		System.out.println("iの値 :" + i);
		
		//for文
		for ( i = 1; i <= 10; i ++) {
			
			System.out.println(i);
			
			for( int j = 1; j <= 10; j ++) {
				System.out.println(j);
			}
		}
		
		//拡張for

		ArrayList<String> employees = new ArrayList<>();
		employees.add("田中太郎");
		employees.add("山田花子");
		employees.add("佐藤次郎");
		
		for( String employee : employees) {
			System.out.println(employee);
		}
	}

}
