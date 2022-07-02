package com.muhammet.entity;

/**
 * Araba, U�ak, Gemi, 
 * @author MuhammetAli
 *
 */
public class Arac {
	// Properties -> De�i�kenler
	public String yakitTuru;
	public String motor;
	public int yolcuKapasitesi;
	public int mevcutYolcuSayisi;
	public int hareketDurumu;
	public int hiz;
	public int maxHiz;
	public int depolamaHacmi;
	public int yakitMiktari;
	
	// Actions -> Methodlar�

	public void Calistir() {
		
	}
	
	public void Hizlan() {
		if(hiz<maxHiz)
			hiz += 1;
	}
	
	public void Yavasla() {
		if(hiz>0)
			hiz -= 1;
	}
	
	public void Dur() {
		
	}
	
	public void YolcuAl(int binenYolcuSayisi) {
		mevcutYolcuSayisi += binenYolcuSayisi;
	}
	
	public void YolcuIndir(int inenYolcuSayisi) {
		mevcutYolcuSayisi -= inenYolcuSayisi;
	}
}
