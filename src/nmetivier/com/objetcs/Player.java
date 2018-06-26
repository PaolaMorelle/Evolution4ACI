package nmetivier.com.objetcs;

import java.util.Date;
import java.util.HashMap;

public class Player {
	private String nom;
	private String prenom;
	private Date dateDeNaissance;
	private Date dateDeCreationDeCompte;
	private Date dateDerniereConnexion;
	private byte age;
	private byte niveau;
	private int vie;
	private int vieMax;
	private short degatsMin;
	private short degatsMax;
	private HashMap attaques; 
	
	public Player() {
		super();
	}
	
	public Player(String nom, String prenom, Date dateDeNaissance, byte niveau) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateDeNaissance = dateDeNaissance;
		this.niveau = niveau;
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
	public Date getDateDeNaissance() {
		return dateDeNaissance;
	}
	public void setDateDeNaissance(Date dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}
	public Date getDateDeCreationDeCompte() {
		return dateDeCreationDeCompte;
	}
	public void setDateDeCreationDeCompte(Date dateDeCreationDeCompte) {
		this.dateDeCreationDeCompte = dateDeCreationDeCompte;
	}
	public Date getDateDerniereConnexion() {
		return dateDerniereConnexion;
	}
	public void setDateDerniereConnexion(Date dateDerniereConnexion) {
		this.dateDerniereConnexion = dateDerniereConnexion;
	}
	public byte getAge() {
		return age;
	}
	public void setAge(byte age) {
		this.age = age;
	}
	public byte getNiveau() {
		return niveau;
	}
	public void setNiveau(byte niveau) {
		this.niveau = niveau;
	}
	public int getVie() {
		return vie;
	}
	public void setVie(int vie) {
		this.vie = vie;
	}
	public int getVieMax() {
		return vieMax;
	}
	public void setVieMax(int vieMax) {
		this.vieMax = vieMax;
	}
	public short getDegatsMin() {
		return degatsMin;
	}
	public void setDegatsMin(short degatsMin) {
		this.degatsMin = degatsMin;
	}
	public short getDegatsMax() {
		return degatsMax;
	}
	public void setDegatsMax(short degatsMax) {
		this.degatsMax = degatsMax;
	}
	
	public HashMap getAttaques() {
		return attaques;
	}

	public void setAttaques(HashMap attaques) {
		this.attaques = attaques;
	}
}
