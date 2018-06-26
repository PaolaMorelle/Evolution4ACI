package nmetivier.com.objetcs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import javax.swing.undo.CannotRedoException;

import nmetivier.com.enumerations.MenuBatimentsActions;
import nmetivier.com.enumerations.MenuMechantsActions;
import nmetivier.com.enumerations.MenuPrincipalActions;
import nmetivier.com.enumerations.MenuSecteursActions;
import nmetivier.com.enumerations.MenuVillesActions;

/**
 * 
 * @author Nicolas.Metivier
 *
 */
public class Menu {
	
	private MenuPrincipalActions[] menuPrincipal;
	private MenuSecteursActions[] menuSecteurs;
	private MenuVillesActions[] menuVilles;
	private MenuBatimentsActions[] menuBatiments;
	private MenuMechantsActions[] menuMechants;
	
	private Scanner keyBoard;
	
	/**
	 * 
	 */
	public Menu() {
		// On se base sur des énumérations et un HashMap pour créer les menus.
		// On créer le menu principal.
		this.menuPrincipal = new MenuPrincipalActions[] { 
				MenuPrincipalActions.SECTORS,
				MenuPrincipalActions.CITIES,
				MenuPrincipalActions.BUILDINGS,
				MenuPrincipalActions.VILAINS,
				MenuPrincipalActions.EXIT
			};

		this.menuSecteurs = new MenuSecteursActions[] {
				MenuSecteursActions.SHOW,
				MenuSecteursActions.BACK
			};

		this.menuVilles = new MenuVillesActions[] {
				MenuVillesActions.SHOW,
				MenuVillesActions.DETAILS,
				MenuVillesActions.CREATE,
				MenuVillesActions.DESTROY,
				MenuVillesActions.BACK
			};

		this.menuBatiments = new MenuBatimentsActions[] {
				MenuBatimentsActions.SHOW,
				MenuBatimentsActions.DETAILS,
				MenuBatimentsActions.CREATE,
				MenuBatimentsActions.DESTROY,
				MenuBatimentsActions.BACK
			};

		this.menuMechants = new MenuMechantsActions[] {
				MenuMechantsActions.SHOW,
				MenuMechantsActions.ATTACK,
				MenuMechantsActions.BACK
			};
		this.keyBoard = new Scanner(System.in);
	}
	
	/**
	 * 
	 */
	public void afficherBanniere() {
		System.out.println("EVOLUTION -- Version 0.2");
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
	}
	
	/**
	 * 
	 */
	public void afficherChoixMenuPrincipal() {
		System.out.println("EVOLUTION -- Menu Principal");
		System.out.println("+++++++++++++++++++++++++++");
		System.out.println("");
		for (MenuPrincipalActions menuItem : this.menuPrincipal) {
			System.out.println("[" + menuItem.getID() + "] - " + menuItem.getValue());
		}
		
		MenuPrincipalActions choix = demanderChoixUtilisateurMenuPrincipal(this.menuPrincipal, this.keyBoard);
		switch (choix) {
		case SECTORS:
			afficherChoixMenuSecteurs();
			break;
		case CITIES:
			afficherChoixMenuVilles();
			break;
		case BUILDINGS:
			afficherChoixMenuBatiments();
			break;
		case VILAINS:
			afficherChoixMenuMechants();
			break;
		case EXIT:
			System.exit(0);
			break;
		}
	}
	
	public void afficherChoixMenuSecteurs() {
		System.out.println("EVOLUTION -- Menu Secteurs");
		System.out.println("+++++++++++++++++++++++++++");
		System.out.println("");
		for (MenuSecteursActions menuItem : this.menuSecteurs) {
			System.out.println("[" + menuItem.getID() + "] - " + menuItem.getValue());
		}
		
		MenuSecteursActions choix = this.demanderChoixUtilisateurMenuSecteurs(this.menuSecteurs, this.keyBoard);
		switch (choix) {
		case SHOW:
			Engine.afficherSecteurs(Jeu.world);
			break;
		case BACK:
			return;
		}
	}
	
	public void afficherChoixMenuVilles() {
		System.out.println("EVOLUTION -- Menu Villes");
		System.out.println("+++++++++++++++++++++++++++");
		System.out.println("");
		for (MenuVillesActions menuItem : this.menuVilles) {
			System.out.println("[" + menuItem.getID() + "] - " + menuItem.getValue());
		}
		
		MenuVillesActions choix = this.demanderChoixUtilisateurMenuVilles(this.menuVilles, this.keyBoard);
		switch (choix) {
		case SHOW:
			this.afficherChoixSousMenuListerVilles(Jeu.world);
			break;
		case DETAILS:
			this.afficherChoixSousMenuDetailsVilles(Jeu.world);
			break;
		case CREATE:
			this.afficherChoixSousMenuCreerVilles(Jeu.world);
			break;
		case DESTROY:
			this.afficherChoixSousMenuDetruireVilles(Jeu.world);
			break;
		case BACK:
			return;
		}
	}
	
	private void afficherChoixSousMenuDetruireVilles(Secteur[] world) {
		// TODO Auto-generated method stub
		
	}

	private void afficherChoixSousMenuCreerVilles(Secteur[] world) {
		// TODO Auto-generated method stub
		
	}

	private void afficherChoixSousMenuDetailsVilles(Secteur[] world) {
		// TODO Auto-generated method stub
		
	}

	private void afficherChoixSousMenuListerVilles(Secteur[] world) {
		// TODO Auto-generated method stub
		
	}

	public void afficherChoixMenuBatiments() {
		System.out.println("EVOLUTION -- Menu Batiments");
		System.out.println("+++++++++++++++++++++++++++");
		System.out.println("");
		for (MenuBatimentsActions menuItem : this.menuBatiments) {
			System.out.println("[" + menuItem.getID() + "] - " + menuItem.getValue());
		}
		
		MenuBatimentsActions choix = this.demanderChoixUtilisateurMenuBatiments(this.menuBatiments, this.keyBoard);
		switch (choix) {
		case SHOW:
			this.afficherChoixSousMenuListerBatiments(Jeu.world);
			break;
		case DETAILS:
			this.afficherChoixSousMenuDetailsBatiments(Jeu.world);
			break;
		case CREATE:
			this.afficherChoixSousMenuCreerBatiments(Jeu.world);
			break;
		case DESTROY:
			this.afficherChoixSousMenuDetruireBatiments(Jeu.world);
			break;
		case BACK:
			return;
		}
	}
	
	private void afficherChoixSousMenuDetruireBatiments(Secteur[] world) {
		// TODO Auto-generated method stub
		
	}

	private void afficherChoixSousMenuCreerBatiments(Secteur[] world) {
		// TODO Auto-generated method stub
		
	}

	private void afficherChoixSousMenuDetailsBatiments(Secteur[] world) {
		// TODO Auto-generated method stub
		
	}

	private void afficherChoixSousMenuListerBatiments(Secteur[] world) {
		// TODO Auto-generated method stub
		
	}

	public void afficherChoixMenuMechants() {
		System.out.println("EVOLUTION -- Menu Mechants");
		System.out.println("+++++++++++++++++++++++++++");
		System.out.println("");
		for (MenuMechantsActions menuItem : this.menuMechants) {
			System.out.println("[" + menuItem.getID() + "] - " + menuItem.getValue());
		}
		
		MenuMechantsActions choix = this.demanderChoixUtilisateurMenuMechants(this.menuMechants, this.keyBoard);
		switch (choix) {
		case SHOW:
			this.afficherChoixSousMenuListerMechants(Jeu.world);
			break;
		case ATTACK:
			this.afficherChoixSousMenuDemarrerCombatMechants(Jeu.world);
			break;
		case BACK:
			return;
		}
	}
	
	private void afficherChoixSousMenuDemarrerCombatMechants(Secteur[] world) {
		// TODO Auto-generated method stub
		
	}

	private void afficherChoixSousMenuListerMechants(Secteur[] world) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * 
	 * @param menu
	 */
	private MenuPrincipalActions demanderChoixUtilisateurMenuPrincipal(MenuPrincipalActions[] menu, Scanner keyBoardCopy) {
		keyBoardCopy = new Scanner(System.in);
		boolean isCorrect = false;
		while (!isCorrect) {
			System.out.print("Votre choix : ");
			int userChoice = keyBoardCopy.nextInt();
			for (MenuPrincipalActions menuItem : menu) {
				if (menuItem.getID() == userChoice) {
					
					return menuItem;
				}
			}
		}
		
		return null;
	}
	
	private MenuSecteursActions demanderChoixUtilisateurMenuSecteurs(MenuSecteursActions[] menu, Scanner keyBoardCopy) {
		keyBoardCopy = new Scanner(System.in);
		boolean isCorrect = false;
		while (!isCorrect) {
			System.out.print("Votre choix : ");
			int userChoice = keyBoard.nextInt();
			for (MenuSecteursActions menuItem : menu) {
				if (menuItem.getID() == userChoice) {
					
					return menuItem;
				}
			}
		}
		
		return null;
	}
	
	private MenuVillesActions demanderChoixUtilisateurMenuVilles(MenuVillesActions[] menu, Scanner keyBoardCopy) {
		keyBoardCopy = new Scanner(System.in);
		boolean isCorrect = false;
		while (!isCorrect) {
			System.out.print("Votre choix : ");
			int userChoice = keyBoardCopy.nextInt();
			for (MenuVillesActions menuItem : menu) {
				if (menuItem.getID() == userChoice) {
					
					return menuItem;
				}
			}
		}
		
		return null;
	}
	
	private MenuBatimentsActions demanderChoixUtilisateurMenuBatiments(MenuBatimentsActions[] menu, Scanner keyBoardCopy) {
		keyBoardCopy = new Scanner(System.in);
		boolean isCorrect = false;
		while (!isCorrect) {
			System.out.print("Votre choix : ");
			int userChoice = keyBoardCopy.nextInt();
			for (MenuBatimentsActions menuItem : menu) {
				if (menuItem.getID() == userChoice) {
					
					return menuItem;
				}
			}
		}
		
		return null;
	}
	
	private MenuMechantsActions demanderChoixUtilisateurMenuMechants(MenuMechantsActions[] menu, Scanner keyBoardCopy) {
		keyBoardCopy = new Scanner(System.in);
		boolean isCorrect = false;
		while (!isCorrect) {
			System.out.print("Votre choix : ");
			int userChoice = keyBoardCopy.nextInt();
			for (MenuMechantsActions menuItem : menu) {
				if (menuItem.getID() == userChoice) {
					return menuItem;
				}
			}
		}
		return null;
	}
	
	
}
