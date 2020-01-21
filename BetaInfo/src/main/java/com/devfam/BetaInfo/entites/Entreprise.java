package com.devfam.BetaInfo.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Entreprise implements Serializable {
		@Id
		@GeneratedValue
		private int id;
       	private String nom;
       	private String domaine;
       	private String adresse;
       	
       	public Entreprise() {
       		
       	}
       	
       	public Entreprise(String nom, String domaine, String adresse) {
       		this.setNom(nom);
       		this.setDomaine(domaine);
       		this.setAdresse(adresse);
       	}
       	
       	public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		public String getDomaine() {
			return domaine;
		}

		public void setDomaine(String domaine) {
			this.domaine = domaine;
		}

		public String getAdresse() {
			return adresse;
		}

		public void setAdresse(String adresse) {
			this.adresse = adresse;
		}

		
}
