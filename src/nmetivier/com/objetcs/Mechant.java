package nmetivier.com.objetcs;

import java.util.Random;

public class Mechant {
	private byte compteur = 0;
	
	private byte id;
	private String nom;
	private short vie;
	
	public byte getId() {
		return this.id;
	}

	public String getNom() {
		return this.nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public short getVie() {
		return this.vie;
	}
	

	public Mechant(String nom, short vie) {
		super();
		compteur ++;
		this.id = compteur;
		this.nom = nom;
		this.vie = vie;
	}
	
	public byte attaquer() {
		byte degats = 0;
		degats = (byte) (0 + (int)(Math.random() * ((24 - 0) + 1)));
		return degats;
	}
	
	public void seFaireTapperDessus(short degats) {
		this.vie = (short) (this.vie - degats);
	}
	
}
