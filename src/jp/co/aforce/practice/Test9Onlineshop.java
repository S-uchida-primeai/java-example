package jp.co.aforce.practice;

import java.util.Scanner;

public class Test9Onlineshop {

	public static void main(String[] args) {
		
		
		/**
		 *  int price  			商品の単価
		 *  int i      			個数
		 *  int goukei			割引前の価格
		 *  int discount  		割引額
		 *  double discountper	割引%
		 *  int discountprice	割引後の価格
		 *  int tax				消費税税率
		 *  int taxprice		消費税額
		 *  int total			税込価格
		 */ 
		
		Scanner scanner1 = new Scanner (System.in);
		System.out.println("商品の単価を入力してください :");
		int price = scanner1.nextInt();
		
		Scanner scanner2 = new Scanner (System.in);
		System.out.println("購入個数を入力してください :");
		int i = scanner2.nextInt();
		
		
		int goukei = price * i;
		System.out.println("割引前の合計金額 :" + goukei);
		
		
		int discount = 0;
		
		if (i >= 3 && i < 5) {
			
			discount = 50;
			
		} else if (i >= 5) {
			
			discount = 100;
			
		}else {
			
			discount = 0;
			
		}
		
		int  sum = 0;
		
		sum = price * i - discount * i;
		
		
		
		
		
		double discountper = 0;
		
		if (sum >= 5000 && sum < 10000 ) {
			
			discountper = 5;
			
		} else if (sum >= 10000) {
			
			discountper = 10;
		
		} else {
			
			discountper = 0;
			
		}
		
		
		
		int discountprice = 0;
		 discountprice = (int) (sum * ((100 - discountper) / 100));		 		 		 
		 
		 System.out.println("割引後の価格 :" + discountprice);
		
		int tax = 10;
		int taxprice = discountprice * tax / 100;
		
		System.out.println("消費税額 :" + taxprice);
		
		int total = discountprice + taxprice;
		
		
		System.out.println("税込価格 :" + total);
		

	}

}
