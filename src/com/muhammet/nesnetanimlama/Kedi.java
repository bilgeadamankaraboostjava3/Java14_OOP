package com.muhammet.nesnetanimlama;

public class Kedi {
	
	// Kedinin özellikleri
	// Method, Değişken, InnerClass, Enum
	// Bir nesnenin durumunu tutan bilgilere STATE denilir.
	// STATE-> attribute, property
	String tur;
	String cins;
	String ad;
	String tuyRengi;
	String gozRengi;
	double boy;
	double agirlik;
	int ayakSayisi;
	int gozSayisi;
	int kuyrukUzunlugu;
	/**
	 * ENUM kavramın doğuş mantığı
	 * 1-Uyuyor,
	 * 2-Uyanık duruyor
	 * 3-hareket ediyor
	 * 4-koşuyor.
	 * 5-uyanık yatıyor
	 */
	int hareketDurumu;
	boolean aclikmi=true;
	int yas;
	int hizi;
	
	// Varlıkların aksiyonları vardır. Class içinde bunlar Method lara denk gelir.
	// Bir sınıfın tüm methodlarına INTERFACE denir.
	public void uyandir() {
		hareketDurumu= 2;
	}
	public void yemekye() {
		aclikmi = false;
	}
	
	public void hizlan() {		
		hizi += 10;
		if(hizi>40)
			hareketDurumu = 4;
	}

}
