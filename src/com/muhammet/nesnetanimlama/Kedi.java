package com.muhammet.nesnetanimlama;

public class Kedi {
	
	// Kedinin �zellikleri
	// Method, De�i�ken, InnerClass, Enum
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
	 * ENUM kavram�n do�u� mant���
	 * 1-Uyuyor,
	 * 2-Uyan�k duruyor
	 * 3-hareket ediyor
	 * 4-ko�uyor.
	 * 5-uyan�k yat�yor
	 */
	int hareketDurumu;
	boolean aclikmi=true;
	int yas;
	int hizi;
	
	// Varl�klar�n aksiyonlar� vard�r. Class i�inde bunlar Method lara denk gelir.
	// Bir s�n�f�n t�m methodlar�na INTERFACE denir.
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
