package com.muhammet;

import com.muhammet.entity.Arac;

public class RunnerArac {

	public static void main(String[] args) {

		// Bir model den, kal�ptan nesne t�retmek.
		// Bir referans data type tan de�i�ken tan�mlama i�lemi.
		Arac araba;
		// bir de�i�kene de�er atama
		araba = new Arac(); // heap alan�nda olu�turulan nesnenin referans�n� de�i�kene atar�z.
		// Nesne t�retme i�lemi. Heap te bir alan olu�turan k�s�m budur.
		new Arac().maxHiz = 100; // farkl� nesne
		/// ???
		new Arac().Hizlan(); // farkl� nesne
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
