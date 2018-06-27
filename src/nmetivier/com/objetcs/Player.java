package nmetivier.com.objetcs;

import java.util.Date;
import java.util.HashMap;

/**
 * 
 * @author Nicolas.Metivier
 *
 */
public class Player extends EtreVivant {

	/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
	/* PROPRIETE - ATTRIBUTS */
	/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
	
	/**
	 * 
	 */
	private String pseudo;
	
	/**
	 * 
	 */
	private String prenom;
	
	/**
	 * 
	 */
	private Date dateDeNaissance;
	
	/**
	 * 
	 */
	private Date dateDeCreationDeCompte;
	
	/**
	 * 
	 */
	private Date dateDerniereConnexion;
	
	/**
	 * 
	 */
	private byte age;
	
	/**
	 * 
	 */
	private byte niveau;
	
	/**
	 * 
	 */
	private int vie;
	
	/**
	 * 
	 */
	private int vieMax;
	
	/**
	 * 
	 */
	private short degatsMin;
	
	/**
	 * 
	 */
	private short degatsMax;
	
	/**
	 * 
	 */
	private HashMap attaques; 
	
	/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
	/* PROPRIETE - ATTRIBUTS */
	/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
	
	/**
	 * 
	 * @return
	 */
	public String getNom() {
		return nom;
	}
	
	/**
	 * 
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getPrenom() {
		return prenom;
	}
	
	/**
	 * 
	 * @param prenom
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	/**
	 * 
	 * @return
	 */
	public Date getDateDeNaissance() {
		return dateDeNaissance;
	}
	
	/**
	 * 
	 * @param dateDeNaissance
	 */
	public void setDateDeNaissance(Date dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}
	
	/**
	 * 
	 * @return
	 */
	public Date getDateDeCreationDeCompte() {
		return dateDeCreationDeCompte;
	}
	
	/**
	 * 
	 * @param dateDeCreationDeCompte
	 */
	public void setDateDeCreationDeCompte(Date dateDeCreationDeCompte) {
		this.dateDeCreationDeCompte = dateDeCreationDeCompte;
	}
	
	/**
	 * 
	 * @return
	 */
	public Date getDateDerniereConnexion() {
		return dateDerniereConnexion;
	}
	
	/**
	 * 
	 * @param dateDerniereConnexion
	 */
	public void setDateDerniereConnexion(Date dateDerniereConnexion) {
		this.dateDerniereConnexion = dateDerniereConnexion;
	}
	
	/**
	 * 
	 * @return
	 */
	public byte getAge() {
		return age;
	}
	
	/**
	 * 
	 * @param age
	 */
	public void setAge(byte age) {
		this.age = age;
	}
	
	/**
	 * 
	 * @return
	 */
	public byte getNiveau() {
		return niveau;
	}
	
	/**
	 * 
	 * @param niveau
	 */
	public void setNiveau(byte niveau) {
		this.niveau = niveau;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getVie() {
		return vie;
	}
	/**
	 * 
	 * @param vie
	 */
	public void setVie(int vie) {
		this.vie = vie;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getVieMax() {
		return vieMax;
	}
	
	/**
	 * 
	 * @param vieMax
	 */
	public void setVieMax(int vieMax) {
		this.vieMax = vieMax;
	}
	
	/**
	 * 
	 * @return
	 */
	public short getDegatsMin() {
		return degatsMin;
	}
	
	/**
	 * 
	 * @param degatsMin
	 */
	public void setDegatsMin(short degatsMin) {
		this.degatsMin = degatsMin;
	}
	
	/**
	 * 
	 * @return
	 */
	public short getDegatsMax() {
		return degatsMax;
	}
	
	/**
	 * 
	 * @param degatsMax
	 */
	public void setDegatsMax(short degatsMax) {
		this.degatsMax = degatsMax;
	}
	
	/**
	 * 
	 * @return
	 */
	public HashMap getAttaques() {
		return attaques;
	}

	/**
	 * 
	 * @param attaques
	 */
	public void setAttaques(HashMap attaques) {
		this.attaques = attaques;
	}
	
	/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
	/* PROPRIETE - ATTRIBUTS */
	/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
	
	/**
	 * 
	 */
	public Player() {
		super();
	}
	
	/**
	 * 
	 * @param nom
	 * @param prenom
	 * @param dateDeNaissance
	 * @param niveau
	 */
	public Player(String nom, String prenom, Date dateDeNaissance, byte niveau) {
		super();
		super.nom = nom;
		this.prenom = prenom;
		this.dateDeNaissance = dateDeNaissance;
		this.niveau = niveau;
	}

	/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
	/* PROPRIETE - ATTRIBUTS */
	/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
	
	
}
