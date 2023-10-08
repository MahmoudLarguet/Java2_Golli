package model;

import java.util.Date;

public class Employe {
	private String cin;
	private int idProfil;
	private String nom;
	private String prenom;
	private Date datnais;
	private String genre;
	private String email;
	
	
	
	public Employe(String cin, int idProfil, String nom, String prenom, Date datnais, String genre, String email) {
		
		this.cin = cin;
		this.idProfil = idProfil;
		this.nom = nom;
		this.prenom = prenom;
		this.datnais = datnais;
		this.genre = genre;
		this.email = email;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public int getIdProfil() {
		return idProfil;
	}
	public void setIdProfil(int idProfil) {
		this.idProfil = idProfil;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDatnais() {
		return datnais;
	}
	public void setDatnais(Date datnais) {
		this.datnais = datnais;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}