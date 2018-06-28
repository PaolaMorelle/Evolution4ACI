package nmetivier.com.objetcs;

/**
 * Classe qui repr�sente un M�chant.
 * Classe fille de Etre Vivant.
 * @author Nicolas.Metivier
 *
 */
public class Mechant extends EtreVivant {
	
	/**
	 * 
	 */
	private static int compteur = 0;
	
	
	/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
	/* PROPRIETE - ATTRIBUTS */
	/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
	

	/**
	 * Identifiant.
	 */
	private int id;
	
	/**
	 * R�cup�re l'identifiant.
	 * @return
	 */
	public int getID() {
		return this.id;
	}

	
	/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
	/* CONSTRUCTEURS */
	/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
	
	/**
	 * 
	 * @param nom
	 * @param vie
	 */
	public Mechant(String nom, byte niveau) {
		super();
		compteur ++;
		this.id = compteur;
		super.nom = nom;
		super.niveau = niveau;
	}
	
}
