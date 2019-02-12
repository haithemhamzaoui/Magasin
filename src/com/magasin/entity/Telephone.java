package com.magasin.entity;

import com.magasin.utils.Unite;

public class Telephone extends Electronique  {
private String modele;

public Telephone(int codeB, String nomA, String descriptionA, double prixU, Unite unite, String marque,
		String codeSerie, boolean livrable, String modele) {
	super(codeB, nomA, descriptionA, prixU, unite, marque, codeSerie, livrable);
	this.modele = modele;
}

public String getModele() {
	return modele;
}

public void setModele(String modele) {
	this.modele = modele;
}



}
