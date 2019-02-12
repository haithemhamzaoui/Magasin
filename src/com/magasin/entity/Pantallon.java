package com.magasin.entity;

import java.awt.Color;

import com.magasin.utils.TailleNumber;
import com.magasin.utils.Unite;

public class Pantallon  extends Vetement {
private String tissu;
private String fit;
private TailleNumber taille;
public Pantallon(int codeB, String nomA, String descriptionA, double prixU, Unite unite, Color couleur, String genre,
		String marque, String tissu, String fit, TailleNumber taille) {
	super(codeB, nomA, descriptionA, prixU, unite, couleur, genre, marque);
	this.tissu = tissu;
	this.fit = fit;
	this.taille = taille;
}
public String getTissu() {
	return tissu;
}
public void setTissu(String tissu) {
	this.tissu = tissu;
}
public String getFit() {
	return fit;
}
public void setFit(String fit) {
	fit = fit;
}
public TailleNumber getTaille() {
	return taille;
}
public void setTaille(TailleNumber taille) {
	this.taille = taille;
}

}
