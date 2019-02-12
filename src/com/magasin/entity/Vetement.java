package com.magasin.entity;

import java.awt.Color;

import com.magasin.utils.Unite;

public class Vetement extends Article {
private Color couleur;
private String genre;
private String marque;
public Vetement(int codeB, String nomA, String descriptionA, double prixU, Unite unite, Color couleur, String genre,
		String marque) {
	super(codeB, nomA, descriptionA, prixU, unite);
	this.couleur = couleur;
	this.genre = genre;
	this.marque = marque;
}
protected Color getCouleur() {
	return couleur;
}
protected void setCouleur(Color couleur) {
	this.couleur = couleur;
}
protected String getGenre() {
	return genre;
}
protected void setGenre(String genre) {
	this.genre = genre;
}
protected String getMarque() {
	return marque;
}
protected void setMarque(String marque) {
	this.marque = marque;
}



}
