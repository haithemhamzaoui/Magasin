package com.magasin.entity;

import com.magasin.utils.Unite;

public class Article {
	private int codeB;
	private String nomA;
	private String descriptionA;
	private double prixU;
	private Unite unite;
	private int idMagasin;
	public Article(int codeB, String nomA, String descriptionA, double prixU, Unite unite) {
		this.codeB = codeB;
		this.nomA = nomA;
		this.descriptionA = descriptionA;
		this.prixU = prixU;
		this.unite = unite;
	}
	
	
	public Article(int codeB, String nomA, String descriptionA, double prixU, Unite unite, int idMagasin) {
		this.codeB = codeB;
		this.nomA = nomA;
		this.descriptionA = descriptionA;
		this.prixU = prixU;
		this.unite = unite;
		this.idMagasin = idMagasin;
	}


	public int getCodeB() {
		return codeB;
	}
	public void setCodeB(int codeB) {
		codeB = codeB;
	}
	public String getNomA() {
		return nomA;
	}
	public void setNomA(String nomA) {
		this.nomA = nomA;
	}
	public String getDescriptionA() {
		return descriptionA;
	}
	public void setDescriptionA(String descriptionA) {
		this.descriptionA = descriptionA;
	}
	public double getPrixU() {
		return prixU;
	}
	public void setPrixU(double prixU) {
		this.prixU = prixU;
	}
	public Unite getUnite() {
		return unite;
	}
	public void setUnite(Unite unite) {
		this.unite = unite;
	}
	

}
