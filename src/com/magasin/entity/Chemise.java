package com.magasin.entity;

import java.awt.Color;

import com.magasin.utils.TailleCaractere;
import com.magasin.utils.Unite;

public class Chemise extends Vetement  {
private String model;
private TailleCaractere taille;
public Chemise(int codeB, String nomA, String descriptionA, double prixU, Unite unite, Color couleur, String genre,
		String marque, String model, TailleCaractere taille) {
	super(codeB, nomA, descriptionA, prixU, unite, couleur, genre, marque);
	this.model = model;
	this.taille = taille;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public TailleCaractere getTaille() {
	return taille;
}
public void setTaille(TailleCaractere taille) {
	this.taille = taille;
}



}
