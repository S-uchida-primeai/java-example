package jp.co.aforce.javaexample;

public class Car {
	String maker;
	Integer year;
	
	public Car (String maker, Integer year) {
		
		this.maker = maker;
		this.year = year;
	}
	
	public void displayInfo() {
		
		System.out.println("メーカーは" + maker + "年式は" + year + "年です。");
		
		
	}

}
