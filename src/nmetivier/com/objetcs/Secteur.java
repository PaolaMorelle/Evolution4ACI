package nmetivier.com.objetcs;

import java.util.Scanner;

/**
 * Classe qui représente un Secteur.
 * Il s'agit d'un ensemble de villes.
 * @author Nicolas.Metivier
 *
 */
public class Secteur {
	private byte compteur = 0;
	
	private byte id;
	private String nom;
	private Ville[] villes;
	
	/**
	 * On récupère l'ID du secteur.
	 * @return
	 */
	public byte getID() {
		return this.id;
	}
	
	/**
	 * On définit le nom du secteur.
	 * @param nomSecteur
	 */
	public void setNom(String nomSecteur) {
		this.nom = nomSecteur;
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
	public Ville[] getVilles() {
		return this.villes;
	}
	
	/**
	 * 
	 * @return
	 */
	public void addVille(int index, Ville ville) {
		this.villes[index] = ville;
	}
	
	/**
	 * 
	 */
	public Secteur() {
		compteur++;
		this.id = compteur;
		Scanner clavier = new Scanner(System.in);
		System.out.print("Nom du secteur : ");
		this.nom = clavier.nextLine();
		this.villes = new Ville[4];
	}
	
	/**
	 * 
	 * @param nomSecteur
	 */
	public Secteur(String nomSecteur) {
		compteur++;
		this.id = compteur;
		this.nom = nomSecteur;
		this.villes = new Ville[4];
	}
	
}
