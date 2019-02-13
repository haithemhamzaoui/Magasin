package com.magasin.entity;

import java.util.Date;

import com.magasin.utils.Unite;

public class Alimentation extends Article {
private Date dateEx;
private boolean estFrais;
public Alimentation(int codeB, String nomA, String descriptionA, double prixU, Unite unite, Date dateEx,
		boolean estFrais) {
	super(codeB, nomA, descriptionA, prixU, unite);
	this.dateEx = dateEx;
	this.estFrais = estFrais;
}
protected Date getDateEx() {
	return dateEx;
}
protected void setDateEx(Date dateEx) {
	this.dateEx = dateEx;
}
protected boolean isEstFrais() {
	return estFrais;
}
protected void setEstFrais(boolean estFrais) {
	this.estFrais = estFrais;
	//test
}

}
