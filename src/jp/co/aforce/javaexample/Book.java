package jp.co.aforce.javaexample;

public class Book {
	String title;
	String author;
	int price;
	
	public void showInfo() {
		System.out.println("タイトル:" + title);
		System.out.println("著者:" + author);
		System.out.println("価格:" + price);
	}
	
	public static  void main(String[]args) {
		
		Book book1 = new Book();
		
		
		book1.title = "スラスラわかるJava";
		book1.author = "中垣健志";
		book1.price = 2600;
		
		book1.showInfo();
		
		
	}

	
}
