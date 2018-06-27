package nmetivier.com.objetcs;

/**
 * 
 * @author Nicolas.Metivier
 *
 */
public class Mechant extends EtreVivant {
	
	/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
	/* PROPRIETE - ATTRIBUTS */
	/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
	
	/**
	 * 
	 */
	private byte compteur = 0;
	
	/**
	 * 
	 */
	private byte id;
	
	/**
	 * 
	 */
	private String nom;
	
	/**
	 * 
	 */
	private short vie;
	
	/**
	 * 
	 * @return
	 */
	public byte getID() {
		return this.id;
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
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	/**
	 * 
	 * @return
	 */
	public short getVie() {
		return this.vie;
	}
	
	/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
	/* CONSTRUCTEURS */
	/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
	
	/**
	 * 
	 * @param nom
	 * @param vie
	 */
	public Mechant(String nom, short vie) {
		super();
		compteur ++;
		this.id = compteur;
		this.nom = nom;
		this.vie = vie;
	}
	
	/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
	/* FONCTIONS - METHODES */
	/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
	
	
	public byte attaquer(Player target) {
		byte degats = 0;
		degats = (byte) (0 + (int)(Math.random() * ((24 - 0) + 1)));
		target.lostLifePoints(degats);
		return degats;
	}
	
}
