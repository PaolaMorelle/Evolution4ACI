package nmetivier.com.objetcs;

import java.util.HashMap;

/**
 * Classe qui représente un Etre-Vivant.
 * Il s'agit d'une classe Parent.
 * @author Nicolas.Metivier
 *
 */
public class EtreVivant {
	
	/**
	 * Nom
	 */
	protected String nom;
	
	/**
	 * Niveau
	 */
	protected byte niveau;
	
	/**
	 * Point de vie restant.
	 */
	protected int vie;
	
	/**
	 * Point de vie maximal.
	 */
	protected int vieMax;
	
	/**
	 * Nombre de dégat généré au minimum.
	 */
	protected short degatsMin;
	
	/**
	 * Nombre de dégat généré au maximum.
	 */
	protected short degatsMax;
	
	/**
	 * Liste des attaques.
	 */
	protected HashMap attaques; 
	
	
	
	
	
	public void setNiveau(byte niveau) {
		this.niveau = niveau;
	}

	public void setAttaques(HashMap attaques) {
		this.attaques = attaques;
	}

	public String getNom() {
		return nom;
	}

	public byte getNiveau() {
		return niveau;
	}

	public int getVie() {
		return vie;
	}

	public int getVieMax() {
		return vieMax;
	}

	public short getDegatsMin() {
		return degatsMin;
	}

	public short getDegatsMax() {
		return degatsMax;
	}

	public HashMap getAttaques() {
		return attaques;
	}

	/**
	 * Représente un être vivant.
	 */
	public EtreVivant() {
		
	}

	/**
	 * Représente un être vivant.
	 * @param nom
	 * @param vie
	 */
	public EtreVivant(String nom) {
		this.nom = nom;
		this.niveau = 1;
	}
	
	/**
	 * Représente un être vivant.
	 * @param nom
	 * @param niveau
	 */
	public EtreVivant(String nom, byte niveau) {
		this.nom = nom;
		this.vie = this.vieMax = 20;
		this.niveau = niveau;
	}
	
	/**
	 * Permet d'attaquer une cible.
	 * @param cible
	 */
	public byte attaquer(EtreVivant cible) {
		byte degats = 0;
		degats = (byte) (0 + (int)(Math.random() * ((24 - 0) + 1)));
		cible.subirDegats(degats);
		return degats;
	}
	
	/**
	 * Enleve des points de vie apres avoir subit des dégats.
	 * @param degats
	 */
	public void subirDegats(int degats) {
		this.vie = this.vie - degats;
	}
	
	public void augmenterNiveau() {
		
	}
}
