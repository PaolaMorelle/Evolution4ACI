package nmetivier.com.objetcs;

import java.util.Scanner;


/**
 * Classe qui repr�sente un Secteur.
 * Il s'agit d'un ensemble de villes.
 * @author Nicolas.Metivier
 *
 */
public class Secteur {
	private byte compteur = 0;
	private byte id;
	private String nom;
	private ArrayList<Ville> villes;
	private int totalVilles;
	private int totalBatiments;
	private int totalMechants;
	
	/**
	 * On r�cup�re l'ID du secteur.
	 * @return
	 */
	public byte getID() {
		return this.id;
	}

	/**
	 * On d�finit le nom du secteur.
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
	

	public int getTotalVilles() {
		return this.totalVilles;
	}

	public int getTotalBatiments() {
		return this.totalBatiments;
	}

	public int getTotalMechants() {
		return this.totalMechants;
	}

	
	/**
	 * 
	 * @return
	 */
	public void addVille(int index, Ville ville) {
		this.villes[index] = ville;
		this.totalVilles = this.villes.length;
		
		this.totalBatiments= 0;
		for (Ville city : this.villes) {
			this.totalBatiments += city.getTotalBatiments();
		}

		this.totalMechants = 0;
		for (Ville city : this.villes) {
			for (Batiment buiding : city.getBatiments()) {
				this.totalMechants += buiding.getTotalMechants();
			}
		}
		
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
		this.totalVilles = this.villes.length;
		
		this.totalBatiments= 0;
		for (Ville city : this.villes) {
			this.totalBatiments += city.getTotalBatiments();
		}

		this.totalMechants = 0;
		for (Ville city : this.villes) {
			for (Batiment buiding : city.getBatiments()) {
				this.totalMechants += buiding.getTotalMechants();
			}
		}
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

		this.totalVilles = this.villes.length;
		
		this.totalBatiments= 0;
		for (Ville city : this.villes) {
			try {
				this.totalBatiments += city.getTotalBatiments();
			} catch (NullPointerException exception) {
				System.err.println("Il n'existe aucune ville pour le moment dans ce secteur.");
			}
			
		}

		this.totalMechants = 0;
		for (Ville city : this.villes) {
			try {
				for (Batiment buiding : city.getBatiments()) {
					this.totalMechants += buiding.getTotalMechants();
				}
			} catch (Exception e) {
				System.err.println("Il n'existe aucune ville pour le moment dans ce secteur.");
			}
			
		}
	}
	
}
