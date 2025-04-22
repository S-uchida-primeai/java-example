package jp.co.aforce.javaexample;

public class test {
	public static void example1(String[] args) {
		int num = 10;
		System.out.println(num);
		example2();
		example3();
		example4();
		
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
		String Scanner = "太郎";
		System.out.println("こんにちは、" + Scanner + "さん");
	}

}
