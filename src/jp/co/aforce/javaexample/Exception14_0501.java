package jp.co.aforce.javaexample;

import java.util.Scanner;

public class Exception14_0501 {
	
	public static void main (String[]args) {
		
		//問題1
		
		
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("2で割り切れる整数をいれてください :");
			String number = scanner.nextLine();
			int number2 = Integer.parseInt(number);
				
			
			
			
		}catch (NumberFormatException e){
			System.out.println("例外が発生しました :" +  e.getMessage());
			
		}
		System.out.println("終了します");
		
		
		
		
		//問題2
		
	/*	try {
			int result = 10 / 0;
			System.out.println("計算結果 : " + result);
			
		}catch (ArithmeticException e) {
			System.out.println("例外が発生しました : " + e.getMessage());
		}
		System.out.println("プログラム終了");
		
		/*実行結果 : 例外が発生しました : / by zero
					プログラム終了*/

		
		
		
		//問題3  予想はB
		
		/*try {
			
			String str = null ;
			System.out.println(str.length());
			
		} catch (ArithmeticException e) {
			
			System.out.println("ArithmeticExceptionが発生しました");
			
		} catch (NullPointerException e) {
		
			System.out.prinltn("NullPointerExceptionが発生しました");
			
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
