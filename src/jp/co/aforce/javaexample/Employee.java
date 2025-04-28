package jp.co.aforce.javaexample;

public class Employee {
	String id;
	String name;
	double money;

	Employee (String id, String name) {
		 this.id = id;
		 this.name = name;
		 this.money = 200000;
	}
	
	
	private void raiseSalary(double percent) {
		this.money = money * percent;
}
	public void showInfo() {
		System.out.println(id + name + money);
	}
	
	
	public static void main(String[]args) {
		Employee yamada = new Employee("2222","山田");
		yamada.raiseSalary(2.0);
		yamada.raiseSalary(5.0);
		yamada.showInfo();
	}
}

