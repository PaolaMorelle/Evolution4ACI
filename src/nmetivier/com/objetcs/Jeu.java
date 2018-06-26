package nmetivier.com.objetcs;

import nmetivier.com.enumerations.Ressource;

/**
 * 
 * @author Nicolas.Metivier
 *
 */
public class Jeu {
	/**
	 * 
	 */
	static Secteur[] world = null;
	
	/**
	 * 
	 */
	private boolean loop;
	
	/**
	 * 
	 */
	public Jeu() {
		world = Engine.createWorld();
		loop = false;
	}
	
	/**
	 * 
	 */
	public void demarrer() {
		if (this.world == null) {
			this.world = Engine.createWorld();
		}

		this.loop = true;
		Menu menu = new Menu();
		while (this.loop) {			
			menu.afficherBanniere();
			menu.afficherChoixMenuPrincipal();			
		}
		
	}
	
	public void stop() {
		this.loop = false;
	}
	
	
}
