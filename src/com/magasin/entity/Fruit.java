package com.magasin.entity;

import java.util.Date;

import com.magasin.utils.Unite;

public class Fruit extends Alimentation  {
private String saison;

public String getSaison() {
	return saison;
}

public void setSaison(String saison) {
	this.saison = saison;
}

public Fruit(int codeB, String nomA, String descriptionA, double prixU, Unite unite, Date dateEx, boolean estFrais,
		String saison) {
	super(codeB, nomA, descriptionA, prixU, unite, dateEx, estFrais);
	this.saison = saison;
}

}
