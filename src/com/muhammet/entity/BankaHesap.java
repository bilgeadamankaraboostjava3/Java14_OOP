package com.muhammet.entity;

public class BankaHesap {
	/**
	 * id ->identity
	 */
	public String uuid;
	public String hesapno;
	public String iban;
	public double miktar;
	/**
	 * Müþteri eklemede 2 yaklaþým
	 * 1-
	 */
	public Musteri musteri;

	/**
	 * 2-
	 */
	public String musteriId;
}
