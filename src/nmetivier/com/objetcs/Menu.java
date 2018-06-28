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
	public void showBanner() {
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
	public void showMainMenu() {
		this.keyBoard = new Scanner(System.in);
		System.out.println("EVOLUTION -- Menu Principal");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("");
		System.out.println("[1] Gestionnaire des SECTEUR");
		System.out.println("[2] Gestionnaire des VILLES");
		System.out.println("[3] Gestionnaire des BATIMENTS");
		System.out.println("[4] Gestionnaire des MECHANTS");
		System.out.println("[0] Revenir en arrière");
		System.out.println("");

		byte userChoice = (byte) -1;
		
		do {
			userChoice = (byte) -1;
			System.out.print("Votre choix : ");
			try {
				userChoice = this.keyBoard.nextByte();
			} catch (InputMismatchException e) {
				System.err.println("Vous n'avez pas appuyé sur un chiffre.");
				userChoice = (byte) -1;
				this.keyBoard.next();
			}
			
		} while ((userChoice < 0) || (userChoice > 4));
		
		switch (userChoice) {
		case 1:
			showSectorsMenu();
			break;
		case 2:
			showCitiesMenu();
			break;
		case 3:
			showBuildingsMenu();
			break;
		case 4:
			showVilainsMenu();
			break;
		case 0:
			System.exit(0);
			break;
		}
	}
	
	/**
	 * 
	 */
	public void showSectorsMenu() {
		System.out.println("EVOLUTION -- Menu Secteurs");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("");
		System.out.println("[1] Lister tout les SECTEURS");
		System.out.println("[0] Revenir en arrière");
		System.out.println("");

		byte userChoice = (byte) -1;
		
		do {
			userChoice = (byte) -1;
			System.out.print("Votre choix : ");
			try {
				userChoice = this.keyBoard.nextByte();
			} catch (InputMismatchException e) {
				System.err.println("Vous n'avez pas appuyé sur un chiffre.");
				userChoice = (byte) -1;
				this.keyBoard.next();
			}
			
		} while ((userChoice < 0) || (userChoice > 1));
		
		switch (userChoice) {
		case 1:
			System.out.println("EVOLUTION -- Liste Secteurs");
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
			Engine.showSectors();
			System.out.println("");
			break;
		case 0:
			System.out.println("");
			return;
		}
	}
	
	/**
	 * 
	 */
	public void showCitiesMenu() {
		System.out.println("EVOLUTION -- Menu Villes");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("");
		System.out.println("[1] Lister les VILLES (Toutes ou par SECTEUR)");
		System.out.println("[2] Afficher une VILLE");
		System.out.println("[3] Créer une VILLE");
		System.out.println("[4] Détruire une VILLE");
		System.out.println("[0] Revenir en arrière");
		System.out.println("");
		
		byte userChoice = (byte) -1;
		
		do {
			userChoice = (byte) -1;
			System.out.print("Votre choix : ");
			try {
				userChoice = this.keyBoard.nextByte();
			} catch (InputMismatchException e) {
				System.err.println("Vous n'avez pas appuyé sur un chiffre.");
				userChoice = (byte) -1;
				this.keyBoard.next();
			}
			
		} while ((userChoice < 0) || (userChoice > 4));
		
		switch (userChoice) {
		case 1:
			showCitiesSubMenuToListCities();
			break;
		case 2:
			showCitiesSubMenuToShowDetailedCity();
			break;
		case 3:
			showCitiesSubMenuToCreateCity();
			break;
		case 4:
			showCitiesSubMenuToDestroyCity();
			break;
		case 0:
			return;
		}
	}
	
	/**
	 * 
	 */
	private void showCitiesSubMenuToListCities() {
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
				System.err.println("Vous n'avez pas appuyé sur un chiffre.");
				userChoice = (byte) -1;
				this.keyBoard.next();
			}
			
		} while ((userChoice < 0) || (userChoice > 2));
		
		switch (userChoice) {
		case 1:System.out.println("EVOLUTION -- Liste Villes");
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
			Engine.showCities();
			System.out.println("");
			break;
		case 2:
			System.out.println("EVOLUTION -- Sous-Menu Villes");
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("");
			Engine.showSectors();
			System.out.println("[0] Retour");
			System.out.println("");

			do {
				userChoice = (byte) -1;
				System.out.print("Votre choix : ");
				try {
					userChoice = this.keyBoard.nextByte();
				} catch (InputMismatchException e) {
					System.err.println("Vous n'avez pas appuyé sur un chiffre.");
					userChoice = (byte) -1;
					this.keyBoard.next();
				}
			} while ((userChoice < 0) || (userChoice > (byte) Jeu.world.length));
			
			if (userChoice == 0) {
				System.out.println("");
				return;
			}
			
			Engine.showCities(Jeu.world[userChoice-1]);
			System.out.println("");
			break;
		case 0:
			System.out.println("");
			return;
		}
		
	}

	/**
	 * 
	 */
	private void showCitiesSubMenuToShowDetailedCity() {
		System.out.println("EVOLUTION -- Sous-Menu Vue Détaillée Ville");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("");
		Engine.showCities();
		System.out.println("[0] Retour");
		System.out.println("");
		
		byte userChoice = (byte) -1;
		
		do {
			userChoice = (byte) -1;
			System.out.print("Votre choix : ");
			try {
				userChoice = this.keyBoard.nextByte();
			} catch (InputMismatchException e) {
				System.err.println("Vous n'avez pas appuyé sur un chiffre.");
				userChoice = (byte) -1;
				this.keyBoard.next();
			}
			
		} while ((userChoice < 0) || (userChoice > Engine.countCities()));
		
		if (userChoice == 0) {
			System.out.println("");
			return;
		}
		
		Engine.inspectCity(userChoice);	// ID de la ville.
		System.out.println("");
	}
	
	/**
	 * 
	 */
	private void showCitiesSubMenuToCreateCity() {
		// TODO Auto-generated method stub
		System.out.println("EVOLUTION -- Sous-Menu Création Ville");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("");
		Engine.createCity();
		System.out.println("");
		
	}
	
	/**
	 * 
	 */
	private void showCitiesSubMenuToDestroyCity() {
		System.out.println("EVOLUTION -- Sous-Menu Destruction Ville");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("");
		Engine.showCities();
		System.out.println("");
		
		byte userChoice = (byte) -1;
		
		do {
			userChoice = (byte) -1;
			System.out.print("Votre choix : ");
			try {
				userChoice = this.keyBoard.nextByte();
			} catch (InputMismatchException e) {
				System.err.println("Vous n'avez pas appuyé sur un chiffre.");
				userChoice = (byte) -1;
				this.keyBoard.next();
			}
			
		} while ((userChoice < 0) || (userChoice > Engine.countCities()));
		
		if (userChoice == 0) {
			System.out.println("");
			return;
		}
		
		Engine.destroyCity(userChoice); // City ID
		
	}
	
	public void showBuildingsMenu() {
		System.out.println("EVOLUTION -- Menu Batiments");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("");
		System.out.println("[1] Lister les BATIMENTS (Tous, par SECTEUR ou par VILLE)");
		System.out.println("[2] Afficher un BATIMENT");
		System.out.println("[3] Créer un BATIMENT");
		System.out.println("[4] Détruire un BATIMENT");
		System.out.println("[0] Revenir en arrière");
		System.out.println("");
		
		byte userChoice = (byte) -1;
		
		do {
			userChoice = (byte) -1;
			System.out.print("Votre choix : ");
			try {
				userChoice = this.keyBoard.nextByte();
			} catch (InputMismatchException e) {
				System.err.println("Vous n'avez pas appuyé sur un chiffre.");
				userChoice = (byte) -1;
				this.keyBoard.next();
			}
			
		} while ((userChoice < 0) || (userChoice > 4));
		
		switch (userChoice) {
		case 1:
			showBuildingsSubMenuToListBuildings();
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
			System.out.println("");
			return;
		}

	}
	
	/**
	 * 
	 */
	private void showBuildingsSubMenuToListBuildings() {
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
				System.err.println("Vous n'avez pas appuyé sur un chiffre.");
				userChoice = (byte) -1;
				this.keyBoard.next();
			}
			
		} while ((userChoice < 0) || (userChoice > 3));
		
		switch (userChoice) {
		case 1:
			Engine.showBuildings();
			System.out.println("");
			break;
		case 2:
			showBuildingsSubMenuToListBuildingsFromSector();
		case 3:
			showBuildingsSubMenuToListBuildingsFromCity();
		case 0:
			System.out.println("");
			return;
		}
	}
	
	/**
	 * 
	 */
	private void showBuildingsSubMenuToListBuildingsFromSector() {
		System.out.println("EVOLUTION -- Sous-Menu Batiments");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("");
		Engine.showSectors();
		System.out.println("[0] Retour");
		System.out.println("");

		byte userChoice = (byte) -1;
		
		do {
			userChoice = (byte) -1;
			System.out.print("Votre choix : ");
			try {
				userChoice = this.keyBoard.nextByte();
			} catch (InputMismatchException e) {
				System.err.println("Vous n'avez pas appuyé sur un chiffre.");
				userChoice = (byte) -1;
				this.keyBoard.next();
			}
			
		} while ((userChoice < 0) || (userChoice > Jeu.world.length));
		
		if (userChoice == 0) {
			System.out.println("");
			return;
		}

		Engine.showBuildings(Jeu.world[userChoice-1]);
		System.out.println("");
	}
	
	
	private void showBuildingsSubMenuToListBuildingsFromCity() {
		System.out.println("EVOLUTION -- Sous-Menu Batiments");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("");
		Engine.showCities();
		System.out.println("[0] Retour");
		System.out.println("");

		byte userChoice = (byte) -1;
		
		do {
			userChoice = (byte) -1;
			System.out.print("Votre choix : ");
			try {
				userChoice = this.keyBoard.nextByte();
			} catch (InputMismatchException e) {
				System.err.println("Vous n'avez pas appuyé sur un chiffre.");
				userChoice = (byte) -1;
				this.keyBoard.next();
			}
			
		} while ((userChoice < 0) || (userChoice > Engine.countCities()));
		
		if (userChoice == 0) {
			System.out.println("");
			return;
		}
		
		Ville selectedCity = Engine.get

		Engine.showBuildings();
		System.out.println("");
	}
	

	private void afficherChoixSousMenuDetailsBatiments() {
		System.out.println("EVOLUTION -- Sous-Menu Vue Détaillée Batiment");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("");
		Engine.showBuildings();
//		Engine.inspectBuilding(building);
	}

	private void afficherChoixSousMenuCreerBatiments() {
		// TODO Auto-generated method stub
		System.out.println("EVOLUTION -- Sous-Menu Création Batiment");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("");
		Engine.buildBuilding();
	}

	private void afficherChoixSousMenuDetruireBatiments() {
		System.out.println("EVOLUTION -- Sous-Menu Destruction Batiment");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("");
		Engine.showBuildings();
		Engine.destroyBuilding();
		
	}

	public void showVilainsMenu() {
		System.out.println("EVOLUTION -- Menu Méchants");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("");
		System.out.println("[1] Lister les MECHANTS (Tous, par SECTEUR, par VILLE ou par BATIMENT)");
		System.out.println("[2] Attaquer un MECHANT");
		System.out.println("[0] Revenir en arrière");
		System.out.println("");

		byte userChoice = (byte) -1;
		
		do {
			userChoice = (byte) -1;
			System.out.print("Votre choix : ");
			try {
				userChoice = this.keyBoard.nextByte();
			} catch (InputMismatchException e) {
				System.err.println("Vous n'avez pas appuyé sur un chiffre.");
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
		System.out.println("EVOLUTION -- Menu Méchants");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("");
		Engine.showVilains();
		System.out.println("");

		byte userChoice = (byte) -1;
		
		do {
			userChoice = (byte) -1;
			System.out.print("Méchant que vous souhaitez combattre : ");
			try {
				userChoice = this.keyBoard.nextByte();
			} catch (InputMismatchException e) {
				System.err.println("Vous n'avez pas appuyé sur un chiffre.");
				userChoice = (byte) -1;
				this.keyBoard.next();
			}
			
		} while ((userChoice < 0) || (userChoice > Engine.countVilains()));
		
		System.out.print("Méchant que vous souhaitez combattre : ");
		Mechant vilain = new Mechant("Débilos", (byte) 1);
		Engine.launchFight(vilain);
		
	}
}
