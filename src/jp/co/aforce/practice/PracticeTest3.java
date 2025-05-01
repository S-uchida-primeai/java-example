package jp.co.aforce.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class PracticeTest3 {
	public static void main(String[]args) {
		
		//問題1
		ArrayList<String> shouhinnList = new ArrayList<String>();
		
		shouhinnList.add("シャープペンシル");
		shouhinnList.add("ボールペン");
		shouhinnList.add("リングノート");
		shouhinnList.add("クリップ");
		shouhinnList.add("消しゴム");
		
		/*ArrayListを使わずに書ける
		 String [] shouhinn = {"シャープペンシル", "ボールペン", "リングノート", "クリップ", "消しゴム"};
		 */
		
		
		//問題2
		String element1 = shouhinnList.get(1);
		System.out.println(element1);
		
		//System.out.println(shouhinnList.get(1));
		
		
		//問題3
		Map<Integer, String> nameMap = new HashMap<>();
		
		nameMap.put(1, "山田太郎" );
		nameMap.put(2,"鈴木花子" );
		nameMap.put(3,"佐藤二郎" );
		nameMap.put(4,"山田太郎" );
		nameMap.put(5,"高橋三郎" );
		
		
		//問題5
		String name = nameMap.get(3);
		System.out.println(name);
		
		//問題6
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(15);
		list1.add(16);
		list1.add(19);
		
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(11);
		list2.add(12);
		list2.add(18);
		list2.add(20);
		
		list1.addAll(list2);
		
		Collections.sort(list1);
		
		for (Integer number : list1) {
			System.out.println(number);
		}
		
		
		//問題7
		ArrayList<Integer> list3 = new ArrayList<>();
		list3.add(13);
		list3.add(14);
		list3.add(17);
		list3.add(21);
		
		for (int i = 0; i < list1.size(); i++) {
			for (int j = i + 1; j < list3.size(); j++) {
				if(list1.get(i) > list1.get(j)) {
					int temp = list1.get(i);
					list1.set(i,  list1.get(j));
					list1.set(i, temp);
				}
			}
		}
		
		for (int i = 0; i < list3.size(); i++) {
			for (int j = i + 1; j < list3.size(); j++) {
				if(list3.get(i) > list3.get(j)) {
					int temp = list1.get(i);
					list1.set(i,  list1.get(j));
					list1.set(j, temp);
					
				}
			}
		}
		
		System.out.println("list1 :" + list1);
		System.out.println("list3 :" + list3);
	}

}
