package com.muhammet;

import java.util.UUID;

import com.muhammet.entity.BankaHesap;
import com.muhammet.entity.Musteri;

public class RunnerMusteriHesap {

	String telefon = ""; // References Data type
	int sayi; // primitive data type
	
	public void Hesaplar() {
		String adres = "neresi???";
	}
	
	public static void main(String[] args) {
		
		
		
		Musteri musteri = new Musteri();
		musteri.ad ="Muhammet";
		musteri.soyad="HOCA";
		musteri.adres="Ankara";
		musteri.annekizliksoyadi="YOKYOK";
		musteri.resim="https://google.cdn.resimlerim/muhammet.jpg";
		musteri.tckimlikno="11100000000";
		musteri.telefon = "0 555 888 99 99";
		musteri.uuid = UUID.randomUUID().toString();
		//---------------------------------------------
		BankaHesap hesap = new BankaHesap();
		hesap.hesapno = "2154 955 666697";
		hesap.iban="TR00 9887 6767 6765 5656 76";
		hesap.uuid = UUID.randomUUID().toString();
		hesap.musteri = musteri;
		System.out.println("1. hesap uuid.......: "+ hesap.uuid);
		System.out.println("1. Hesap Bilgileri..: "+ hesap.hesapno);
		System.out.print("Müþteri ad soyad......: ");
		System.out.println(hesap.musteri.ad + " "+hesap.musteri.soyad);
		hesap = new BankaHesap();
		hesap.hesapno = "9587 55445 5565";
		hesap.iban="TR41 7000 6767 6765 5656 76";
		hesap.uuid = UUID.randomUUID().toString();
		hesap.musteri = musteri;
		System.out.println("2. hesap uuid.......: "+ hesap.uuid);
		System.out.println("2. Hesap Bilgileri..: "+ hesap.hesapno);
		System.out.print("Müþteri ad soyad......: ");
		System.out.println(hesap.musteri.ad + " "+hesap.musteri.soyad);
	}

}
