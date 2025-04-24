package jp.co.aforce.javaexample;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		int num = 10;
		System.out.println(num);
		example2();
		example3();
		example4();
		example5();
		
}
	
	public static void example2() {
		int a = 8;
		int b = 5;
		int sum = a + b;
		System.out.println(sum);
	}
	
	public static void example3() {
		int width = 7;
		int height = 4;
		int area = width * height;
		System.out.println(area);
	}
	
	public static void example4() {
		String name = "Java";
		double version = 17.0;
		boolean isFun = true;
		System.out.println(name);
		System.out.println(version);
		System.out.println(isFun);
	}
	
	public static void example5() {
		Scanner scanner =new Scanner(System.in);
		System.out.println("お名前を入力してください");
		String name = scanner.nextLine();
		System.out.println("こんにちは、" + name + "さん!");
		scanner.close();
	}
	

}
