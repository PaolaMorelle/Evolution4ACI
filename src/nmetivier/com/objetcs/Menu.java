package nmetivier.com.objetcs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import nmetivier.com.enumerations.MenuActions;

/**
 * 
 * @author Nicolas.Metivier
 *
 */
public class Menu {
	
	private MenuActions[] menuPrincipal, menuSecteurs, menuVilles, menuBatiments, menuMechants;
	
	/**
	 * 
	 */
	public Menu() {
		// On se base sur des énumérations et un HashMap pour créer les menus.
		// On créer le menu principal.
		menuPrincipal = new MenuActions[] { 
				MenuActions.SECTORS,
				MenuActions.CITIES,
				MenuActions.BUILDINGS,
				MenuActions.VILAINS,
				MenuActions.EXIT
			};
	}
	
	/**
	 * 
	 */
	public void afficherBanniere() {
		System.out.println("EVOLUTION -- Version 0.1");
		System.out.println("========================");
		System.out.println("");
		System.out.println("       _____________________________________________________");
		System.out.println("      /  _______________________________   ________________/ ");
		System.out.println("     /  /                      _        | |");
		System.out.println("    /  /_____  __      __ __  | | _   _ | | _   __   _   _");
		System.out.println("   /  ______/  \\ \\    /     \\ | || | | || || | /  \\ | \\ | |");
		System.out.println("  /  /          \\ \\  / /| /\\ || || | | || || || /\\ ||  \\| |");
		System.out.println(" /  /____________\\ \\/ / | \\/ || || \\_/ || || || \\/ || |\\\\ |");
		System.out.println("/____________________/   \\__/ |_| \\___/ |_||_| \\__/ |_| \\_|");
		System.out.println("");
		this.afficherChoixMenuPrincipal();
	}
	
	/**
	 * 
	 */
	private void afficherChoixMenuPrincipal() {
		System.out.println("EVOLUTION -- Menu Principal");
		System.out.println("+++++++++++++++++++++++++++");
		System.out.println("");
		for (MenuActions menuItem : menuPrincipal) {
			System.out.println(menuItem.name());
		}
		
		demanderChoixUtilisateur();
	}
	
	/**
	 * @param menuPrincipal2 
	 * 
	 */
	private void demanderChoixUtilisateur() {
		
	}
	
	
}
