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
	 * M��teri eklemede 2 yakla��m
	 * 1-
	 */
	public Musteri musteri;

	/**
	 * 2-
	 */
	public String musteriId;
}
