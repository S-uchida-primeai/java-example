package jp.co.aforce.javaexample;

import java.util.HashMap;
import java.util.Map;

public class todaykadaiSample {
	public static void main (String[]args) {
		Map<String, Integer> nameMap = new HashMap<>();

		
		nameMap.put("りんご", 100);
		nameMap.put("みかん", 80);
		nameMap.put("バナナ", 120);
		nameMap.put("いちご", 300);
		
		String key="りんご";
		int value;
		
		if(key == "りんご") {
			
			value = nameMap.get(key);
			System.out.println(value);
		
		
		
		}else if (key =="みかん") {
			
			value = nameMap.get(key);
			System.out.println(value);
			
		}else if (key=="バナナ") {
			
			value = nameMap.get(key);
			System.out.println(value);
			
		}else if (key=="いちご") {
			value = nameMap.get(key);
			System.out.println(value);
			
		}else {
			System.out.println("申し訳ありませんが、その商品は取り扱っておりません。");
		}
	}

}
