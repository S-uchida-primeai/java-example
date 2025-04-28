package jp.co.aforce.javaexample;

public class Student {
	String name;
	int[] score;

	Student (String name, int[] score) {
		this.name = name;
		this.score = score;
		
	}

	private double avg() {
		
		int sum = 0;
			for (int ssss : score) {
				
				sum += ssss;
				
				
		}
			return (double) sum / score.length;
			
					
		}
	public void showInfo() {
		System.out.println("名前 :" + name + "平均点" + avg());
	}
	

	

	public static void main (String[]args) {
		int[] score = {29,47,53};
		Student yamada = new Student("山田", score);
		yamada.showInfo();	
	}
	
		
		
	
	
	
	

}
