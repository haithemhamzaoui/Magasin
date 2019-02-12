package com.magasin.entity;

import com.magasin.utils.TypeTelevision;
import com.magasin.utils.Unite;

public class Televison  extends Electronique {
private double Diametre;
private TypeTelevision typeTv;
public Televison(int codeB, String nomA, String descriptionA, double prixU, Unite unite, String marque,
		String codeSerie, boolean livrable, double diametre, TypeTelevision typeTv) {
	super(codeB, nomA, descriptionA, prixU, unite, marque, codeSerie, livrable);
	Diametre = diametre;
	this.typeTv = typeTv;
}
public double getDiametre() {
	return Diametre;
}
public void setDiametre(double diametre) {
	Diametre = diametre;
}
public TypeTelevision getTypeTv() {
	return typeTv;
}
public void setTypeTv(TypeTelevision typeTv) {
	this.typeTv = typeTv;
} 



}
