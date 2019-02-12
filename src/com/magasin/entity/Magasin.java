package com.magasin.entity;

import java.awt.List;
import java.util.ArrayList;

public class Magasin {
	private int idMagasin;
	private String nomM;
	private String adresse;
	private int capaciteVetement;
	private int capaciteAlimentation;
	private int capaciteElectronique;
	private ArrayList<Article>listArticle;
	private ArrayList<Vente>listVente;
	public Magasin(int idMagasin, String nomM, String adresse, int capaciteVetement, int capaciteAlimentation,
			int capaciteElectronique) {
		this.idMagasin = idMagasin;
		this.nomM = nomM;
		adresse = adresse;
		this.capaciteVetement = capaciteVetement;
		this.capaciteAlimentation = capaciteAlimentation;
		this.capaciteElectronique = capaciteElectronique;
		listArticle=new ArrayList<Article>();
	}
	public String getNomM() {
		return nomM;
	}
	public void setNomM(String nomM) {
		this.nomM = nomM;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		adresse = adresse;
	}
	public int getCapaciteVetement() {
		return capaciteVetement;
	}
	public void setCapaciteVetement(int capaciteVetement) {
		this.capaciteVetement = capaciteVetement;
	}
	public int getCapaciteAlimentation() {
		return capaciteAlimentation;
	}
	public void setCapaciteAlimentation(int capaciteAlimentation) {
		this.capaciteAlimentation = capaciteAlimentation;
	}
	public int getCapaciteElectronique() {
		return capaciteElectronique;
	}
	public void setCapaciteElectronique(int capaciteElectronique) {
		this.capaciteElectronique = capaciteElectronique;
	}
	public int getIdMagasin() {
		return idMagasin;
	}
	public void setIdMagasin(int idMagasin) {
		this.idMagasin = idMagasin;
	}
	
	

}
