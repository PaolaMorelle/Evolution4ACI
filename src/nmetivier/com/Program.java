package nmetivier.com;

import nmetivier.com.objetcs.Jeu;

/**
 * Classe principale.
 * @author Nicolas.Metivier
 *
 */
public class Program {
	
	/**
	 * Fonction principle, aussi appel� point d'entr�.
	 * @param args
	 */
	public static void main(String[] args) {
		Jeu game = new Jeu();	// On cr�� le jeu.
		game.demarrer();		// On lance le jeu.
	}

}
