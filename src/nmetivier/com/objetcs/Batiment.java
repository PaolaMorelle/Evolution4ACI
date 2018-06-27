package nmetivier.com.objetcs;

import java.util.ArrayList;
import java.util.Scanner;

import nmetivier.com.enumerations.Ressource;

/**
 * Classe qui représente un Batiment.
 * Il s'agit d'un ensemble de batiments.
 * @author Nicolas.Metivier
 *
 */
public class Batiment {
	private byte compteur = 0;
	
	private byte id;
	private String nom;
	private Ressource ressource;
	private int vie;
	private short stock;
	private String description;
	private ArrayList<Mechant> mechants;
	private int totalMechants;
	
	/**
	 * On récupère l'ID du Batiment.
	 * @return
	 */
	public byte getID() {
		return this.id;
	}
	
	/**
	 * On définit le nom du Batiment.
	 * @param nomBatiment
	 */
	public void setNom(String nomBatiment) {
		this.nom = nomBatiment;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getNom() {
		return this.nom;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getTotalMechants() {
		return this.totalMechants;
	}
	
	/**
	 * 
	 * @return
	 */
	public Ressource getRessource() {
		return this.ressource;
	}
	
	public int getVie() {
		return this.vie;
	}
	
	/**
	 * 
	 * @param vieBatiment
	 */
	public void setVie(int vieBatiment) {
		this.vie = vieBatiment;
	}
	
	public short getStock() {
		return this.stock;
	}
	
	/**
	 * 
	 * @param vieBatiment
	 */
	public void setStock(short stockBatiment) {
		this.stock = stockBatiment;
	}
	
	/**
	 * 
	 * @return
	 */
	public ArrayList<Mechant> getMechants() {
		return this.mechants;
	}
	
	/**
	 * 
	 * @param vilain
	 */
	public void addMechant(Mechant vilain) {
		this.mechants.add(vilain);
		this.totalMechants = this.mechants.size();
	}
	
	/**
	 * 
	 */
	public Batiment() {
		compteur++;
		this.id = compteur;
		Scanner clavier = new Scanner(System.in);
		System.out.print("Nom du Batiment : ");
		this.nom = clavier.nextLine();
		this.mechants = new ArrayList<Mechant>();
		this.totalMechants = this.mechants.size();
		this.ressource = Ressource.CARBURANT;
		this.vie = 1000;
		this.stock = 10;
		this.description = "";
	}
	
	/**
	 * 
	 * @param nomBatiment
	 */
	public Batiment(Ressource ressource, String nomBatiment, int vie, short stock, String description) {
		compteur++;
		this.id = compteur;
		this.nom = nomBatiment;
		this.mechants = new ArrayList<Mechant>();
		this.totalMechants = this.mechants.size();
		this.ressource = ressource;
		this.vie = vie;
		this.stock = stock;
		this.description = description;
	}
	
}
