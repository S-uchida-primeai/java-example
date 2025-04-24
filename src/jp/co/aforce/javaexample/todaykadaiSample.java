package jp.co.aforce.javaexample;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class todaykadaiSample {
	public static void main (String[]args) {
		Map<String, Integer> nameMap = new HashMap<>();

		
		nameMap.put("りんご", 100);
		nameMap.put("みかん", 80);
		nameMap.put("バナナ", 120);
		nameMap.put("いちご", 300);
		
		
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("購入する果物を入力してください:");
		String key = scanner.nextLine();
		
		int value = nameMap.get(key);
		
		
		scanner.close();
		
		if(key.equals( "りんご")) {
			
			
			System.out.println(value);
		
		
		
		}else if (key.equals("みかん")) {
			
			
			System.out.println(value);
			
		}else if (key.equals("バナナ")) {
			
			
			System.out.println(value);
			
		}else if (key.equals("いちご")) {
			
			System.out.println(value);
			
		}else {
			System.out.println("申し訳ありませんが、その商品は取り扱っておりません。");
		}
		
		
		
		
		
	}

}
