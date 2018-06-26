package nmetivier.com.objetcs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Classe qui repr�sente un Ville.
 * Il s'agit d'un ensemble de m�chants.
 * @author Nicolas.Metivier
 *
 */
public class Ville {
	private byte compteur = 0;
	
	private byte id;
	private String nom;
	private ArrayList<Batiment> batiments;
	
	/**
	 * On r�cup�re l'ID du Ville.
	 * @return
	 */
	public byte getID() {
		return this.id;
	}
	
	/**
	 * On d�finit le nom du Ville.
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
	}
	
	/**
	 * Fonction qui r�cup�re le premier �l�ment de la liste.
	 * @param valeurARecuperer
	 * valeurARecuperer : 0 -> On r�cup�re la cl� et la valeur.
	 * valeurARecuperer : 1 -> On r�cup�re la cl�.
	 * valeurARecuperer : 2 -> On r�up�re la valeur.
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
	
}
