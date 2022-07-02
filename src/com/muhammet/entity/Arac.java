package com.muhammet.entity;

/**
 * Araba, Uçak, Gemi, 
 * @author MuhammetAli
 *
 */
public class Arac {
	// Properties -> Deðiþkenler
	public String yakitTuru;
	public String motor;
	public int yolcuKapasitesi;
	public int mevcutYolcuSayisi;
	public int hareketDurumu;
	public int hiz;
	public int maxHiz;
	public int depolamaHacmi;
	public int yakitMiktari;
	
	// Actions -> Methodlarý

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
