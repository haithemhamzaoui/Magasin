package com.magasin.entity;

import java.sql.Date;
import java.util.ArrayList;

import com.magasin.utils.Adress;
import com.magasin.utils.TypePayement;

public class Commande {
protected int idV;
protected Date dateVente;
protected TypePayement typePay;
protected String adress;
ArrayList<Article> listArticle = new ArrayList();

public Commande(int idV, Date dateVente, TypePayement typePay, String adress, ArrayList<Article> listArticle) {
	super();
	this.idV = idV;
	this.dateVente = dateVente;
	this.typePay = typePay;
	this.adress = adress;
	this.listArticle = listArticle;
}

public Commande() {
	super();
}

public int getIdV() {
	return idV;
	
}
public void setIdV(int idV) {
	this.idV = idV;
}
public Date getDateVente() {
	return dateVente;
}
public void setDateVente(Date dateVente) {
	this.dateVente = dateVente;
}
public TypePayement getTypePay() {
	return typePay;
}
public void setTypePay(TypePayement typePay) {
	this.typePay = typePay;
}
public String getAdress() {
	return adress;
}
public void setAdress(String adress) {
	this.adress = adress;
}
public ArrayList<Article> getListArticle() {
	return listArticle;
}
public void setListArticle(ArrayList<Article> listArticle) {
	this.listArticle = listArticle;
}
public class Facture 
{
	private double Qte ;
	private String nomProduit;
	private double prixUnitaire;
	private double total;
	
	public Facture(double qte, String nomProduit, double prixUnitaire, double total) {
		super();
		Qte = qte;
		this.nomProduit = nomProduit;
		this.prixUnitaire = prixUnitaire;
		this.total = total;
	}
	public double getQte() {
		return Qte;
	}
	public void setQte(double qte) {
		Qte = qte;
	}
	public double getPrixUnitaire() {
		return prixUnitaire;
	}
	public void setPrixUnitaire(double prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public String getNomProduit() {
		return nomProduit;
	}
	
}
public class Livraison
{
	private Adress adress ;
	private ArrayList<Article> articles = new ArrayList<>();
	public Livraison(Adress adress, ArrayList<Article> articles) {
		super();
		this.adress = adress;
		this.articles = articles;
	}
	public Livraison() {
		super();
	}
	public Adress getAdress() {
		return adress;
	}
	public void setAdress(Adress adress) {
		this.adress = adress;
	}
	public ArrayList<Article> getArticles() {
		return articles;
	}
	public void setArticles(ArrayList<Article> articles) {
		this.articles = articles;
	}
	
}

}
