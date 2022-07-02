package com.muhammet;

import com.muhammet.entity.Arac;

public class RunnerArac {

	public static void main(String[] args) {

		// Bir model den, kalýptan nesne türetmek.
		// Bir referans data type tan deðiþken tanýmlama iþlemi.
		Arac araba;
		// bir deðiþkene deðer atama
		araba = new Arac(); // heap alanýnda oluþturulan nesnenin referansýný deðiþkene atarýz.
		// Nesne türetme iþlemi. Heap te bir alan oluþturan kýsým budur.
		new Arac().maxHiz = 100; // farklý nesne
		/// ???
		new Arac().Hizlan(); // farklý nesne
		araba.depolamaHacmi = 200;
		araba.hiz = 0;
		araba.maxHiz = 230;
		araba.Hizlan();araba.Hizlan();araba.Hizlan();araba.Hizlan();
		System.out.println("Araba.....: "+ araba.hiz);
		System.out.println("new Arac..: "+ new Arac().hiz);
		int sayi;
		sayi = 6;

	}

}
