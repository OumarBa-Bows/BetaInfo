package com.devfam.BetaInfo.entites;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Information {
	@Id
	@GeneratedValue
	private int id_info; 
	private String date_publication;
	private String libele;
	private Entreprise entreprise;
	private String date_expiration;
	
	public Information() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Information(String datepub, String libele, Entreprise entre, String date_ex) {
		this.date_publication = datepub;
		this.libele = libele;
		this.entreprise = entre;
		this.date_expiration= date_ex; 
	}
	
	public int getId_info() {
		return id_info;
	}

	public void setId_info(int id_info) {
		this.id_info= id_info;
	}

	public String getDate_publication() {
		return date_publication;
	}

	public void setDate_publication(String date_publication) {
		this.date_publication = date_publication;
	}


	public String getLibele() {
		return libele;
	}


	public void setLibele(String libele) {
		this.libele = libele;
	}


	public Entreprise getEntreprise() {
		return entreprise;
	}


	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}


	public String getDate_expiration() {
		return date_expiration;
	}


	public void setDate_expiration(String date_expiration) {
		this.date_expiration = date_expiration;
	}
	
}
