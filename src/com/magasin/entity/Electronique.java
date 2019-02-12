package com.magasin.entity;

import com.magasin.utils.Unite;

public class Electronique  extends Article{
private String marque;
private String codeSerie;
private boolean livrable;
public Electronique(int codeB, String nomA, String descriptionA, double prixU, Unite unite, String marque,
		String codeSerie, boolean livrable) {
	super(codeB, nomA, descriptionA, prixU, unite);
	this.marque = marque;
	this.codeSerie = codeSerie;
	this.livrable = livrable;
}
protected String getMarque() {
	return marque;
}
protected void setMarque(String marque) {
	this.marque = marque;
}
protected String getCodeSerie() {
	return codeSerie;
}
protected void setCodeSerie(String codeSerie) {
	this.codeSerie = codeSerie;
}
protected boolean isLivrable() {
	return livrable;
}
protected void setLivrable(boolean livrable) {
	this.livrable = livrable;
}

}
