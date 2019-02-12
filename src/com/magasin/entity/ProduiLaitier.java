package com.magasin.entity;

import java.util.Date;

import com.magasin.utils.TypeL;
import com.magasin.utils.Unite;

public class ProduiLaitier extends Alimentation  {
private TypeL typeL;

public ProduiLaitier(int codeB, String nomA, String descriptionA, double prixU, Unite unite, Date dateEx,
		boolean estFrais, TypeL typeL) {
	super(codeB, nomA, descriptionA, prixU, unite, dateEx, estFrais);
	this.typeL = typeL;
}

public TypeL getTypeL() {
	return typeL;
}

public void setTypeL(TypeL typeL) {
	this.typeL = typeL;
}


}
