package nmetivier.com.objetcs;

import nmetivier.com.enumerations.TypeAttaque;

/**
 * 
 * @author Nicolas.Metivier
 *
 */
public class Attaque {
	private int id;
	private byte niveau;
	private TypeAttaque nom;
	private int degatMin;
	private int degatMax;
	
	/**
	 * 
	 * @param nom
	 * @param niveau
	 */
	public Attaque(TypeAttaque nom, byte niveau) {
		this.nom = nom;
		this.niveau = niveau;
		
		switch (this.niveau) {
		case 1:
			this.degatMin = 1;
			this.degatMax = 5;
			break;
		case 2:
			this.degatMin = 5;
			this.degatMax = 10;
			break;
		case 3:
			this.degatMin = 10;
			this.degatMax = 15;
			break;
		case 4:
			this.degatMin = 15;
			this.degatMax = 20;
			break;
		case 5:
			this.degatMin = 20;
			this.degatMax = 30;
			break;
		default:
			break;
		}
		
	}
	
	/**
	 * 
	 * @return
	 */
	public int generateDamage() {
		int damageTmp1 =  (int) ((Math.random() * ((this.degatMax+1) - this.degatMin)) + this.degatMin);
		int damageTmp2 =  (int) ((Math.random() * ((this.degatMax+1) - this.degatMin)) + this.degatMin);
		
		int totalDamage = damageTmp1 + damageTmp2;

		if ((damageTmp1 ==  damageTmp2) && (damageTmp1 > ((this.degatMax * 90)/100))) {
			return totalDamage; 
		}
		
		return (int) ((damageTmp1 + damageTmp2)/2); 
	}
	
	
}
