package jp.co.aforce.javaexample;

public class taiyakirennsyuu {
	String filling;
	
	public void setFilling(String value) {
		filling = value;
	}

	public void showFilling() {
		System.out.println("このたい焼きの中身は :" + filling + "です。");
	}
	
	public static void main(String[]args) {
		
		taiyakirennsyuu taiyaki1 = new taiyakirennsyuu();
		taiyakirennsyuu taiyaki2 = new taiyakirennsyuu();
		
		taiyaki1.filling = "クリーム";
		
		taiyaki2.filling = "あんこ";
		
		taiyaki1.showFilling();
		taiyaki2.showFilling();
	}
}
