package nmetivier.com.objetcs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Classe qui représente un Ville.
 * Il s'agit d'un ensemble de méchants.
 * @author Nicolas.Metivier
 *
 */
public class Ville {
	private static byte compteur = 0;
	
	private byte id;
	private String nom;
	private ArrayList<Batiment> batiments;
	
	private int totalBatiments;
	private int totalMechants;
	
	/**
	 * On récupère l'ID du Ville.
	 * @return
	 */
	public byte getID() {
		return this.id;
	}
	
	/**
	 * On définit le nom du Ville.
	 * @param nomVille
	 */
	public void setNom(String nomVille) {
		this.nom = nomVille;
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
	public ArrayList<Batiment> getBatiments() {
		return this.batiments;
	}

	/**
	 * 
	 * @param index
	 * @param batiment
	 */
	public void addBatiment(Batiment batiment) {
		this.batiments.add(batiment);
		this.totalBatiments = this.batiments.size();
		this.totalMechants = 0;
		for (Batiment buiding : this.batiments) {
			this.totalMechants += buiding.getTotalMechants();
		}
	}
	
	/**
	 * 
	 */
	public Ville() {
		compteur++;
		this.id = compteur;
		Scanner clavier = new Scanner(System.in);
		System.out.print("Nom du Ville : ");
		this.nom = clavier.nextLine();
		this.batiments = new ArrayList<Batiment>();
		this.totalBatiments = this.batiments.size();
		this.totalMechants = 0;
		for (Batiment buiding : this.batiments) {
			this.totalMechants += buiding.getTotalMechants();
		}
	}
	
	/**
	 * 
	 * @param nomVille
	 */
	public Ville(String nomVille) {
		compteur++;
		this.id = compteur;
		this.nom = nomVille;
		this.batiments = new ArrayList<Batiment>();
		this.totalBatiments = this.batiments.size();
		this.totalMechants = 0;
		for (Batiment buiding : this.batiments) {
			this.totalMechants += buiding.getTotalMechants();
		}
	}
	
	/**
	 * Fonction qui récupère le premier élément de la liste.
	 * @param valeurARecuperer
	 * valeurARecuperer : 0 -> On récupère la clé et la valeur.
	 * valeurARecuperer : 1 -> On récupère la clé.
	 * valeurARecuperer : 2 -> On réupère la valeur.
	 * @return
	 */
	private int recupererPremierBatiment(int valeurARecuperer) {
		if ((valeurARecuperer < 0) || (valeurARecuperer > 2)) {
			return -1;
		}
		else { 
			return 0;
		}
	}
	
	public int getTotalBatiments() {
		return this.batiments.size();
	}

	public int getTotalMechants() {
		return this.totalMechants;
	}

	private int getLastBuilding() {
		return -1;
	}
	
}
