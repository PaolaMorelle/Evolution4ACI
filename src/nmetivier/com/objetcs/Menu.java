package nmetivier.com.objetcs;

import java.util.InputMismatchException;
import java.util.Scanner;


/**
 * 
 * @author Nicolas.Metivier
 *
 */
public class Menu {
	
	private Scanner keyBoard;
	
	/**
	 * 
	 */
	public Menu() {
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
		this.keyBoard = new Scanner(System.in);
		System.out.println("EVOLUTION -- Menu Principal");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("");
		System.out.println("[1] Gestionnaire des SECTEUR");
		System.out.println("[2] Gestionnaire des VILLES");
		System.out.println("[3] Gestionnaire des BATIMENTS");
		System.out.println("[4] Gestionnaire des MECHANTS");
		System.out.println("[0] Revenir en arri�re");
		System.out.println("");

		byte userChoice = (byte) -1;
		
		do {
			userChoice = (byte) -1;
			System.out.print("Votre choix : ");
			try {
				userChoice = this.keyBoard.nextByte();
			} catch (InputMismatchException e) {
				System.err.println("Vous n'avez pas appuy� sur un chiffre.");
				userChoice = (byte) -1;
				this.keyBoard.next();
			}
			
		} while ((userChoice < 0) || (userChoice > 4));
		
		switch (userChoice) {
		case 1:
			afficherChoixMenuSecteurs();
			break;
		case 2:
			afficherChoixMenuVilles();
			break;
		case 3:
			afficherChoixMenuBatiments();
			break;
		case 4:
			afficherChoixMenuMechants();
			break;
		case 0:
			System.exit(0);
			break;
		}
	}
	
	public void afficherChoixMenuSecteurs() {
		System.out.println("EVOLUTION -- Menu Secteurs");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("");
		System.out.println("[1] Lister tout les SECTEURS");
		System.out.println("[0] Revenir en arri�re");
		System.out.println("");

		byte userChoice = (byte) -1;
		
		do {
			userChoice = (byte) -1;
			System.out.print("Votre choix : ");
			try {
				userChoice = this.keyBoard.nextByte();
			} catch (InputMismatchException e) {
				System.err.println("Vous n'avez pas appuy� sur un chiffre.");
				userChoice = (byte) -1;
				this.keyBoard.next();
			}
			
		} while ((userChoice < 0) || (userChoice > 1));
		
		switch (userChoice) {
		case 1:
			Engine.showSectors();
			break;
		case 0:
			return;
		}
	}
	
	public void afficherChoixMenuVilles() {
		System.out.println("EVOLUTION -- Menu Villes");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("");
		System.out.println("[1] Lister les VILLES (Toutes ou par SECTEUR)");
		System.out.println("[2] Afficher une VILLE");
		System.out.println("[3] Cr�er une VILLE");
		System.out.println("[4] D�truire une VILLE");
		System.out.println("[0] Revenir en arri�re");
		System.out.println("");
		
		byte userChoice = (byte) -1;
		
		do {
			userChoice = (byte) -1;
			System.out.print("Votre choix : ");
			try {
				userChoice = this.keyBoard.nextByte();
			} catch (InputMismatchException e) {
				System.err.println("Vous n'avez pas appuy� sur un chiffre.");
				userChoice = (byte) -1;
				this.keyBoard.next();
			}
			
		} while ((userChoice < 0) || (userChoice > 4));
		
		switch (userChoice) {
		case 1:
			afficherChoixSousMenuListerVilles();
			break;
		case 2:
			afficherChoixSousMenuDetailsVilles();
			break;
		case 3:
			afficherChoixSousMenuCreerVilles();
			break;
		case 4:
			afficherChoixSousMenuDetruireVilles();
			break;
		case 0:
			return;
		}
	}
	
	private void afficherChoixSousMenuDetruireVilles() {
		System.out.println("EVOLUTION -- Sous-Menu Destruction Ville");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("");
		Engine.showCities();
		Engine.destroyCity();
		
	}

	private void afficherChoixSousMenuCreerVilles() {
		// TODO Auto-generated method stub
		System.out.println("EVOLUTION -- Sous-Menu Cr�ation Ville");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("");
		Engine.createCity();
		
	}

	private void afficherChoixSousMenuDetailsVilles() {
		System.out.println("EVOLUTION -- Sous-Menu Vue D�taill�e Ville");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("");
		Engine.showCities();
//		Engine.inspectCity(city);
	}

	private void afficherChoixSousMenuListerVilles() {
		System.out.println("EVOLUTION -- Sous-Menu Villes");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("");
		System.out.println("[1] Afficher toutes les VILLES");
		System.out.println("[2] Afficher les VILLES d'un SECTEUR");
		System.out.println("[0] Retour");
		System.out.println("");

		byte userChoice = (byte) -1;
		
		do {
			userChoice = (byte) -1;
			System.out.print("Votre choix : ");
			try {
				userChoice = this.keyBoard.nextByte();
			} catch (InputMismatchException e) {
				System.err.println("Vous n'avez pas appuy� sur un chiffre.");
				userChoice = (byte) -1;
				this.keyBoard.next();
			}
			
		} while ((userChoice < 0) || (userChoice > 2));
		
		switch (userChoice) {
		case 1:
			Engine.showCities();
			break;
		case 2:
			System.out.println("EVOLUTION -- Sous-Menu Villes");
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("");
			Engine.showSectors();
			System.out.println("[0] Retour");
			System.out.println("");
			System.out.print("Votre choix : ");
			
			// TODO : Gestion du choix au clavier.
			
//			Engine.showCities(sector);
			break;
		case 0:
			return;
		}
		
	}

	public void afficherChoixMenuBatiments() {
		System.out.println("EVOLUTION -- Menu Batiments");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("");
		System.out.println("[1] Lister les BATIMENTS (Tous, par SECTEUR ou par VILLE)");
		System.out.println("[2] Afficher un BATIMENT");
		System.out.println("[3] Cr�er un BATIMENT");
		System.out.println("[4] D�truire un BATIMENT");
		System.out.println("[0] Revenir en arri�re");
		System.out.println("");
		
		byte userChoice = (byte) -1;
		
		do {
			userChoice = (byte) -1;
			System.out.print("Votre choix : ");
			try {
				userChoice = this.keyBoard.nextByte();
			} catch (InputMismatchException e) {
				System.err.println("Vous n'avez pas appuy� sur un chiffre.");
				userChoice = (byte) -1;
				this.keyBoard.next();
			}
			
		} while ((userChoice < 0) || (userChoice > 4));
		
		switch (userChoice) {
		case 1:
			afficherChoixSousMenuListerBatiments();
			break;
		case 2:
			afficherChoixSousMenuDetailsBatiments();
			break;
		case 3:
			afficherChoixSousMenuCreerBatiments();
			break;
		case 4:
			afficherChoixSousMenuDetruireBatiments();
			break;
		case 0:
			return;
		}

	}
	
	private void afficherChoixSousMenuDetruireBatiments() {
		System.out.println("EVOLUTION -- Sous-Menu Destruction Batiment");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("");
		Engine.showBuildings();
		Engine.destroyBuilding();
		
	}

	private void afficherChoixSousMenuCreerBatiments() {
		// TODO Auto-generated method stub
		System.out.println("EVOLUTION -- Sous-Menu Cr�ation Batiment");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("");
		Engine.buildBuilding();
	}

	private void afficherChoixSousMenuDetailsBatiments() {
		System.out.println("EVOLUTION -- Sous-Menu Vue D�taill�e Batiment");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("");
		Engine.showBuildings();
//		Engine.inspectBuilding(building);
	}

	private void afficherChoixSousMenuListerBatiments() {
		System.out.println("EVOLUTION -- Sous-Menu Batiments");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("");
		System.out.println("[1] Afficher tous les BATIMENTS");
		System.out.println("[2] Afficher les BATIMENTS d'un SECTEUR");
		System.out.println("[3] Afficher les BATIMENTS d'une VILLE");
		System.out.println("[0] Retour");
		System.out.println("");

		byte userChoice = (byte) -1;
		
		do {
			userChoice = (byte) -1;
			System.out.print("Votre choix : ");
			try {
				userChoice = this.keyBoard.nextByte();
			} catch (InputMismatchException e) {
				System.err.println("Vous n'avez pas appuy� sur un chiffre.");
				userChoice = (byte) -1;
				this.keyBoard.next();
			}
			
		} while ((userChoice < 0) || (userChoice > 3));
		
		switch (userChoice) {
		case 1:
			Engine.showBuildings();
			break;
		case 2:
			System.out.println("EVOLUTION -- Sous-Menu Villes");
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("");
			Engine.showSectors();
			System.out.println("[0] Retour");
			System.out.println("");

			userChoice = (byte) -1;
			
			do {
				userChoice = (byte) -1;
				System.out.print("Votre choix : ");
				try {
					userChoice = this.keyBoard.nextByte();
				} catch (InputMismatchException e) {
					System.err.println("Vous n'avez pas appuy� sur un chiffre.");
					userChoice = (byte) -1;
					this.keyBoard.next();
				}
				
			} while ((userChoice < 0) || (userChoice > Engine.countCities()));
			
//			Engine.showCities(sector);
			break;
		case 0:
			return;
		}
	}

	public void afficherChoixMenuMechants() {
		System.out.println("EVOLUTION -- Menu M�chants");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("");
		System.out.println("[1] Lister les MECHANTS (Tous, par SECTEUR, par VILLE ou par BATIMENT)");
		System.out.println("[2] Attaquer un MECHANT");
		System.out.println("[0] Revenir en arri�re");
		System.out.println("");

		byte userChoice = (byte) -1;
		
		do {
			userChoice = (byte) -1;
			System.out.print("Votre choix : ");
			try {
				userChoice = this.keyBoard.nextByte();
			} catch (InputMismatchException e) {
				System.err.println("Vous n'avez pas appuy� sur un chiffre.");
				userChoice = (byte) -1;
				this.keyBoard.next();
			}
			
		} while ((userChoice < 0) || (userChoice > 2));
		
		switch (userChoice) {
		case 1:
			this.afficherChoixSousMenuListerMechants();
			break;
		case 2:
			this.afficherChoixSousMenuDemarrerCombatMechants();
			break;
		case 0:
			return;
		}
	}
	
	private void afficherChoixSousMenuDemarrerCombatMechants() {
		// TODO Auto-generated method stub
		
	}

	private void afficherChoixSousMenuListerMechants() {
		// TODO Auto-generated method stub
		System.out.println("EVOLUTION -- Menu M�chants");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("");
		Engine.showVilains();
		System.out.println("");

		byte userChoice = (byte) -1;
		
		do {
			userChoice = (byte) -1;
			System.out.print("M�chant que vous souhaitez combattre : ");
			try {
				userChoice = this.keyBoard.nextByte();
			} catch (InputMismatchException e) {
				System.err.println("Vous n'avez pas appuy� sur un chiffre.");
				userChoice = (byte) -1;
				this.keyBoard.next();
			}
			
		} while ((userChoice < 0) || (userChoice > Engine.countVilains()));
		
		System.out.print("M�chant que vous souhaitez combattre : ");
		Mechant vilain = new Mechant("D�bilos", (short) 2000);
		Engine.launchFight(vilain);
		
	}
}
