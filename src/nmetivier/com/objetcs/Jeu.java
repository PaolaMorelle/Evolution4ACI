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
	static Player player = null;
	
	/**
	 * 
	 */
	private boolean loop;
	
	/**
	 * 
	 */
	public Jeu() {
		world = Engine.createWorld();
		player = new Player();
		loop = false;
	}
	
	/**
	 * 
	 */
	public void demarrer() {
		if (this.world == null) {
			this.world = Engine.createWorld();
		}
		
		if (this.player == null) {
			this.player = new Player();
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
