package jp.co.aforce.javaexample;

public class KankouDate {
	
	String city ;
	int kokunai;
	int kaigai;
	
	//コンストラクター
	public KankouDate (String city, int kokunai, int kaigai) {
		this.city = city;
		this.kokunai = kokunai;
		this.kaigai = kaigai;		
		
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getKokunai() {
		return kokunai;
	}

	public void setKokunai(int kokunai) {
		this.kokunai = kokunai;
	}

	public int getKaigai() {
		return kaigai;
	}

	public void setKaigai(int kaigai) {
		this.kaigai = kaigai;
	}
	
	public int sum() {
		return this.kokunai + this.kaigai;
	}

}
