package com.magasin.utils;

public enum Adress { 
	
	Bizerte("1 jours"),tunis1("1 jours"),tunis2("1 jours"),Ariana("1 jours"),Béja("2 jours"),BenArous("1 jours"),Gabès("3 jours"),Gafsa("3 jours"),Jendouba("3 jours"),Kairouan("3 jours"),Kasserine("3 jours"),Kef("3 jours"),Mahdia("3 jours"),
	Manouba("1 jours"),Médenine("3 jours"),Monastir("2 jours"),Nabeul("1 jours"),Sfax("3 jours"),SidBouzid("3 jours"),Siliana("3 jours"),Sousse("2 jours"),Tataouine("3 jours"),Tozeur("3 jours"),Zaghouan("3 jours");

	String adresse;
	
	private Adress(String adresse) {
		this.adresse= adresse;
	}
	
	public String getAdresse() {
		return adresse;
	}
}
