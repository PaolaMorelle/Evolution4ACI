package nmetivier.com;

import nmetivier.com.objetcs.Jeu;

/**
 * Classe principale.
 * @author Nicolas.Metivier
 *
 */
public class Program {
	
	/**
	 * Fonction principle, aussi appelé point d'entré.
	 * @param args
	 */
	public static void main(String[] args) {
		Jeu game = new Jeu();	// On créé le jeu.
		game.demarrer();		// On lance le jeu.
	}

}
