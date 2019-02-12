package com.magasin.entity;

import java.awt.Color;

import com.magasin.utils.Pointure;
import com.magasin.utils.Unite;

public class Chaussure extends Vetement {
private Pointure pointure;

public Chaussure(int codeB, String nomA, String descriptionA, double prixU, Unite unite, Color couleur, String genre,
		String marque, Pointure pointure) {
	super(codeB, nomA, descriptionA, prixU, unite, couleur, genre, marque);
	this.pointure = pointure;
}

public Pointure getPointure() {
	return pointure;
}

public void setPointure(Pointure pointure) {
	this.pointure = pointure;
}



}
