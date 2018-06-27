package nmetivier.com.objetcs;

import java.util.HashMap;

public class EtreVivant {
	protected String nom;
	protected byte niveau;
	protected int vie;
	protected int vieMax;
	protected short degatsMin;
	protected short degatsMax;
	protected HashMap attaques; 
	
	public EtreVivant() {

	}

	public EtreVivant(String nom, int vie) {
		this.nom = nom;
		this.vie = this.vieMax = vie;
		this.niveau = 1;
	}
	
	public EtreVivant(String nom, byte niveau) {
		this.nom = nom;
		this.vie = this.vieMax = 20;
		this.niveau = niveau;
	}
	
	public void attack(EtreVivant target) {
		
	}
	
	public void lostLifePoints(int damages) {
		this.vie = this.vie - damages;
	}
}
