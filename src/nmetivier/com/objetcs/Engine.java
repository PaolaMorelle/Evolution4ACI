package nmetivier.com.objetcs;

import java.util.ArrayList;

import nmetivier.com.enumerations.Ressource;

public class Engine {

	/**
	 * Fonction qui g�n�re les secteurs.
	 * @return
	 */
	static Secteur[] createWorld() {
		byte totalSecteur = 3;
		
		Secteur[] secteurs = new Secteur[totalSecteur];
		
		secteurs[0] = new Secteur("Azeroth");
		secteurs[0].addVille(new Ville("L'Exodar"));
		secteurs[0].getVille(0).addBatiment(new Batiment(Ressource.CARBURANT, "Station Avia #0", 100, (short) 5, null));
		secteurs[0].getVille(0).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[0].getVille(0).getBatiments().get(0).addMechant(new Mechant("Korialstrasz", (byte) 10));
		secteurs[0].getVille(0).getBatiments().get(0).addMechant(new Mechant("Tyranastrasz", (byte) 10));
		secteurs[0].getVille(0).getBatiments().get(0).addMechant(new Mechant("Caelestrasz", (byte) 10));
		secteurs[0].getVille(0).getBatiments().get(0).addMechant(new Mechant("Vaelastrasz", (byte) 10));
		secteurs[0].getVille(0).getBatiments().get(0).addMechant(new Mechant("Keristrasza", (byte) 10));
		
		secteurs[0].getVille(0).addBatiment(new Batiment(Ressource.MUNITIONS, "Armunation LOW #0", 200, (byte) 10, null));
		secteurs[0].getVille(0).getBatiments().get(0).addMechant(new Mechant("Malygos", (byte) 10));
		secteurs[0].getVille(0).getBatiments().get(0).addMechant(new Mechant("Kalecgos", (byte) 10));
		secteurs[0].getVille(0).getBatiments().get(0).addMechant(new Mechant("Sindragosa", (byte) 10));
		secteurs[0].getVille(0).getBatiments().get(0).addMechant(new Mechant("Saphiron", (byte) 10));
		
		secteurs[0].getVille(0).addBatiment(new Batiment(Ressource.NOURITURE, "Lidl #0", 400, (short) 50, null));
		secteurs[0].getVille(0).getBatiments().get(0).addMechant(new Mechant("Nozdormu", (byte) 10));
		secteurs[0].getVille(0).getBatiments().get(0).addMechant(new Mechant("Anachronos", (byte) 10));
		secteurs[0].getVille(0).getBatiments().get(0).addMechant(new Mechant("Chronormu", (byte) 10));
		secteurs[0].getVille(0).getBatiments().get(0).addMechant(new Mechant("Soridormi", (byte) 10));
		
		secteurs[0].getVille(0).addBatiment(new Batiment(Ressource.NOURITURE, "SuboMacDo #0", 800, (byte) 100, null));
		secteurs[0].getVille(0).getBatiments().get(0).addMechant(new Mechant("Ysera", (byte) 10));
		secteurs[0].getVille(0).getBatiments().get(0).addMechant(new Mechant("Eranikus", (byte) 10));
		secteurs[0].getVille(0).getBatiments().get(0).addMechant(new Mechant("Valithria Marcher�ve", (byte) 10));
		
		
		secteurs[0].addVille(new Ville("Orgrimar"));
		secteurs[0].getVille(1).addBatiment(new Batiment(Ressource.NOURITURE, "Lidl #1", 1000, (byte) 1000, null));
		secteurs[0].getVille(1).getBatiments().get(0).addMechant(new Mechant("Neltharion", (byte) 10));
		secteurs[0].getVille(1).getBatiments().get(0).addMechant(new Mechant("Onyxia", (byte) 10));
		secteurs[0].getVille(1).getBatiments().get(0).addMechant(new Mechant("N�farian", (byte) 10));
		secteurs[0].getVille(1).getBatiments().get(0).addMechant(new Mechant("Sinestra", (byte) 10));
		secteurs[0].getVille(1).getBatiments().get(0).addMechant(new Mechant("Irion", (byte) 10));
		
		secteurs[0].getVille(1).addBatiment(new Batiment(Ressource.NOURITURE, "Auchanps #0", 1200, (byte) 1000, null));
		secteurs[0].getVille(1).getBatiments().get(0).addMechant(new Mechant("Murozond", (byte) 10));
		secteurs[0].getVille(1).getBatiments().get(0).addMechant(new Mechant("Deathwing", (byte) 10));
		
		secteurs[0].getVille(1).addBatiment(new Batiment(Ressource.MUNITIONS, "Armunation LOW #1", 1400, (short) 1500, null));
		secteurs[0].getVille(1).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[0].getVille(1).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[0].getVille(1).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[0].getVille(1).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[0].getVille(1).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		
		secteurs[0].getVille(1).addBatiment(new Batiment(Ressource.NOURITURE, "Auchanps #1", 1800, (short) 500, null));
		secteurs[0].getVille(1).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[0].getVille(1).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[0].getVille(1).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[0].getVille(1).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[0].getVille(1).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		
		secteurs[0].getVille(1).addBatiment(new Batiment(Ressource.NOURITURE, "Lidl #2", 2000, (short) 500, null));
		secteurs[0].getVille(1).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[0].getVille(1).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[0].getVille(1).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[0].getVille(1).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[0].getVille(1).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		
		secteurs[0].getVille(1).addBatiment(new Batiment(Ressource.CARBURANT, "Station Esso #0", 2500, (byte) 1000, null));
		secteurs[0].getVille(1).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[0].getVille(1).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[0].getVille(1).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[0].getVille(1).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[0].getVille(1).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		
		
		secteurs[0].addVille(new Ville("Forgefer"));
		secteurs[0].getVille(2).addBatiment(new Batiment(Ressource.MUNITIONS, "Armunation LOW #2", 3000, (byte) 1000, null));
		secteurs[0].getVille(2).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[0].getVille(2).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[0].getVille(2).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[0].getVille(2).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[0].getVille(2).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		
		secteurs[0].getVille(2).addBatiment(new Batiment(Ressource.MUNITIONS, "Armunation LOW #3", 3500, (byte) 1000, null));
		secteurs[0].getVille(2).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[0].getVille(2).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[0].getVille(2).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[0].getVille(2).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[0].getVille(2).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		
		
		secteurs[0].addVille(new Ville("Lune d'Argent"));
		secteurs[0].getVille(3).addBatiment(new Batiment(Ressource.CARBURANT, "Station Esso #2", 3500, (byte) 1000, null));
		secteurs[0].getVille(3).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[0].getVille(3).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[0].getVille(3).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[0].getVille(3).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[0].getVille(3).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		
		secteurs[0].getVille(3).addBatiment(new Batiment(Ressource.CARBURANT, "Station Total #0", 3750, (byte) 1000, null));
		secteurs[0].getVille(3).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[0].getVille(3).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[0].getVille(3).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[0].getVille(3).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[0].getVille(3).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		
		secteurs[0].getVille(3).addBatiment(new Batiment(Ressource.CARBURANT, "Station Avia  #1", 4000, (byte) 1000, null));
		secteurs[0].getVille(3).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[0].getVille(3).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[0].getVille(3).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[0].getVille(3).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[0].getVille(3).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		
		
		secteurs[1] = new Secteur("Outreterre");
		secteurs[1].addVille(new Ville("Hurlevent"));
		secteurs[1].getVille(0).addBatiment(new Batiment(Ressource.CARBURANT, "Station Esso #3", 4500, (short) 2000, null));
		secteurs[1].getVille(0).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[1].getVille(0).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[1].getVille(0).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[1].getVille(0).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[1].getVille(0).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		
		secteurs[1].getVille(0).addBatiment(new Batiment(Ressource.CARBURANT, "Station Total #2", 5000, (short) 2000, null));
		secteurs[1].getVille(0).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[1].getVille(0).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[1].getVille(0).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[1].getVille(0).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[1].getVille(0).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		
		secteurs[1].getVille(0).addBatiment(new Batiment(Ressource.CARBURANT, "Station Total #3", 5500, (short) 2000, null));
		secteurs[1].getVille(0).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[1].getVille(0).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[1].getVille(0).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[1].getVille(0).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[1].getVille(0).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		
		
		secteurs[1].addVille(new Ville("Fosoyyeuse"));
		secteurs[1].getVille(1).addBatiment(new Batiment(Ressource.CARBURANT, "Station Total #4", 10000, (short) 5000, null));
		secteurs[1].getVille(1).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[1].getVille(1).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[1].getVille(1).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[1].getVille(1).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[1].getVille(1).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		
		secteurs[1].getVille(1).addBatiment(new Batiment(Ressource.MUNITIONS, "Armunation LOW #4", 15000, (short) 5000, null));
		secteurs[1].getVille(1).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[1].getVille(1).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[1].getVille(1).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[1].getVille(1).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[1].getVille(1).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
	
		secteurs[1].getVille(1).addBatiment(new Batiment(Ressource.CARBURANT, "Station Total #5", 20000, (short) 5000, null));
		secteurs[1].getVille(1).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[1].getVille(1).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[1].getVille(1).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[1].getVille(1).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[1].getVille(1).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		
		secteurs[1].getVille(1).addBatiment(new Batiment(Ressource.CARBURANT, "Station Total #6", 25000, (short) 5000, null));
		secteurs[1].getVille(1).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[1].getVille(1).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[1].getVille(1).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[1].getVille(1).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[1].getVille(1).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		
		
		secteurs[1].addVille(new Ville("Les Pitons du Tonnerres"));
		secteurs[1].getVille(2).addBatiment(new Batiment(Ressource.MUNITIONS, "Armunation HEAVY #0", 40000, (short) 5000, null));
		secteurs[1].getVille(2).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[1].getVille(2).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[1].getVille(2).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[1].getVille(2).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[1].getVille(2).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		
		secteurs[1].getVille(2).addBatiment(new Batiment(Ressource.CARBURANT, "Station Total #7", 45000, (short) 5000, null));
		secteurs[1].getVille(2).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[1].getVille(2).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[1].getVille(2).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[1].getVille(2).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[1].getVille(2).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		
		
		secteurs[1].addVille(new Ville("Shattrath"));
		secteurs[1].getVille(3).addBatiment(new Batiment(Ressource.CARBURANT, "Station Total #8", 45000, (short) 5000, null));
		secteurs[1].getVille(3).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[1].getVille(3).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[1].getVille(3).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[1].getVille(3).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[1].getVille(3).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		

		
		secteurs[2] = new Secteur("Nightmare");
		secteurs[2].addVille(new Ville("Dalaran"));
		secteurs[2].getVille(0).addBatiment(new Batiment(Ressource.NOURITURE, "Auchanps #2", 45000, (byte) 10000, null));
		secteurs[2].getVille(0).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[2].getVille(0).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[2].getVille(0).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[2].getVille(0).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[2].getVille(0).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		
		secteurs[2].getVille(0).addBatiment(new Batiment(Ressource.CARBURANT, "Station Esso #4", 40000, (short) 20000, null));
		secteurs[2].getVille(0).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[2].getVille(0).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[2].getVille(0).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[2].getVille(0).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[2].getVille(0).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		
		
		secteurs[2].addVille(new Ville("Darnasus"));
		secteurs[2].getVille(1).addBatiment(new Batiment(Ressource.NOURITURE, "Auchanps #3", 35000, (short) 20000, null));
		secteurs[2].getVille(1).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[2].getVille(1).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[2].getVille(1).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[2].getVille(1).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[2].getVille(1).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		
		secteurs[2].getVille(1).addBatiment(new Batiment(Ressource.NOURITURE, "SuboMacDo #1", 30000, (short) 20000, null));
		secteurs[2].getVille(1).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[2].getVille(1).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[2].getVille(1).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[2].getVille(1).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[2].getVille(1).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		
		secteurs[2].getVille(1).addBatiment(new Batiment(Ressource.NOURITURE, "SuboMacDo #2", 50000, (short) 20000, null));
		secteurs[2].getVille(1).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[2].getVille(1).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[2].getVille(1).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[2].getVille(1).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[2].getVille(1).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		
		
		secteurs[2].addVille(new Ville("Fer de Lance"));
		secteurs[2].getVille(2).addBatiment(new Batiment(Ressource.NOURITURE, "SuboMacDo #3", 100000, (short) 50000, null));
		secteurs[2].getVille(2).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[2].getVille(2).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[2].getVille(2).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[2].getVille(2).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[2].getVille(2).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		
		secteurs[2].getVille(2).addBatiment(new Batiment(Ressource.NOURITURE, "Auchanps #4", 200000, (short) 50000, null));
		secteurs[2].getVille(2).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[2].getVille(2).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[2].getVille(2).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[2].getVille(2).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[2].getVille(2).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		
		secteurs[2].getVille(2).addBatiment(new Batiment(Ressource.NOURITURE, "Station Avia", 300000, (short) 50000, null));
		secteurs[2].getVille(2).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[2].getVille(2).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[2].getVille(2).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[2].getVille(2).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[2].getVille(2).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		
		secteurs[2].getVille(2).addBatiment(new Batiment(Ressource.CARBURANT, "Station Avia  #2", 400000, (short) 50000, null));
		secteurs[2].getVille(2).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[2].getVille(2).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[2].getVille(2).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[2].getVille(2).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[2].getVille(2).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		
		
		secteurs[2].addVille(new Ville("Le Maelstrom"));
		secteurs[2].getVille(3).addBatiment(new Batiment(Ressource.CARBURANT, "Station Total #9", 500000, (byte) 100000, null));
		secteurs[2].getVille(3).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[2].getVille(3).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[2].getVille(3).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[2].getVille(3).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[2].getVille(3).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		
		secteurs[2].getVille(3).addBatiment(new Batiment(Ressource.NOURITURE, "Lidl #3", 700000, (byte) 100000, null));
		secteurs[2].getVille(3).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[2].getVille(3).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[2].getVille(3).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[2].getVille(3).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[2].getVille(3).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		
		secteurs[2].getVille(3).addBatiment(new Batiment(Ressource.MUNITIONS, "Armunation HEAVY #1", 800000, (byte) 100000, null));
		secteurs[2].getVille(3).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[2].getVille(3).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[2].getVille(3).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[2].getVille(3).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[2].getVille(3).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		
		secteurs[2].getVille(3).addBatiment(new Batiment(Ressource.CARBURANT, "Station Total #10", 900000, (byte) 100000, null));
		secteurs[2].getVille(3).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[2].getVille(3).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[2].getVille(3).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[2].getVille(3).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[2].getVille(3).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		
		secteurs[2].getVille(3).addBatiment(new Batiment(Ressource.MUNITIONS, "Armunation HEAVY #2", 999999, (byte) 100000, null));
		secteurs[2].getVille(3).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[2].getVille(3).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[2].getVille(3).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[2].getVille(3).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		secteurs[2].getVille(3).getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (byte) 10));
		

		
		return secteurs;
	}
	
	
	public static void showSectors() {
		for (Secteur sector : Jeu.world) {
			int totalCities = 0;
			int totalBuildings = 0;
			System.out.println(
					String.format(
							"[%S] - %S \t %S ville(s)",
							sector.getID(),
							sector.getNom(),
							countCities(sector)
						)
					);
		}
	}

	
	public static void showCities() {
		for (Secteur sector : Jeu.world) {
			for (Ville city : sector.getVilles()) {
				int totalBuildings = 0;
				System.out.println(
						String.format(
								"[%S] - %S (Secteur de %S) \t %S batiment(s)",
								city.getID(),
								city.getNom(),
								sector.getNom(),
								countBuildings(city)
							)
						);
			}
		}
	}
	
	public static void showCities(Secteur sector) {
		for (Ville city : sector.getVilles()) {
			int totalBuildings = 0;
			System.out.println(
					String.format(
							"[%S] - %S \t %S batiment(s)",
							city.getID(),
							city.getNom(),
							countBuildings(city)
						)
					);
		}
	}
	
	public static Ville[] getCities() {
		Ville[] cities = null;
		
		ArrayList<Ville> citiesTMP = new ArrayList<Ville>();
		for (Secteur sector : Jeu.world) {
			citiesTMP.addAll(sector.getVilles());
		}
		return cities;

	}
	
	public static ArrayList<Ville> getCities(Secteur sector) {
		return sector.getVilles();
	}
	
	public static void showBuildings() {
		for (Secteur sector : Jeu.world) {
			for (Ville city : sector.getVilles()) {
				for (Batiment building : city.getBatiments()) {
					System.out.println(
							String.format(
									"[%S] - %S \t (Secteur de %S) \t (Ville de %S) \t G�n�re %S \t %S mechant(s)",
									building.getID(),
									building.getNom(),
									sector.getNom(),
									city.getNom(),
									building.getRessource(),
									countVilains(building)
								)
							);
				}
			}
		}
	}

	public static void showBuildings(Secteur sector) {
		for (Ville city : sector.getVilles()) {
			for (Batiment building : city.getBatiments()) {
				System.out.println(
						String.format(
								"[%S] - %S \t (Ville de %S) \t G�n�re %S \t %S mechant(s)",
								building.getID(),
								building.getNom(),
								city.getNom(),
								building.getRessource(),
								countVilains(building)
							)
						);
			}
		}
	}
	
	public static void showBuildings(Ville city) {
		for (Batiment building : city.getBatiments()) {
			int totalVilains = 0;
			System.out.println(
					String.format(
							"[%S] - %S \t G�n�re %S \t %S mechant(s)",
							building.getID(),
							building.getNom(),
							building.getRessource(),
							countVilains(building)
						)
					);
		}
	}
	
	
	public static void showVilains() {
		for (Secteur sector : Jeu.world) {
			for (Ville city : sector.getVilles()) {
				for (Batiment building : city.getBatiments()) {
					for (Mechant vilain : building.getMechants()) {
						System.out.println(
								String.format(
										"[%S] - %S \t (Secteur de %S) \t (Ville de %S) \t (Batiment %S)",
										vilain.getID(),
										vilain.getNom(),
										sector.getNom(),
										city.getNom(),
										building.getNom()
									)
								);
					}
				}
			}
		}
	}

	public static void showVilains(Secteur sector) {
		for (Ville city : sector.getVilles()) {
			for (Batiment building : city.getBatiments()) {
				for (Mechant vilain : building.getMechants()) {
					System.out.println(
							String.format(
									"[%S] - %S \t (Ville de %S) \t (Batiment %S)",
									vilain.getID(),
									vilain.getNom(),
									city.getNom(),
									building.getNom()
								)
							);
				}
			}
		}
	}
	
	public static void showVilains(Ville city) {
		for (Batiment building : city.getBatiments()) {
			for (Mechant vilain : building.getMechants()) {
				System.out.println(
						String.format(
								"[%S] - %S \t (Batiment %S)",
								vilain.getID(),
								vilain.getNom(),
								building.getNom()
							)
						);
			}
		}
	}
	
	public static void showVilains(Batiment building) {
		int totalVilains = 0;
		for (Mechant vilain : building.getMechants()) {
			System.out.println(
					String.format(
							"[%S] - %S",
							vilain.getID(),
							vilain.getNom()
						)
					);
		}
	}
	
	
	public static int countCities() {
		int total = 0;
		for (Secteur sector : Jeu.world) {
			total += sector.getVilles().size();
		}
		return total;
	}
	
	public static int countCities(Secteur sector) {
		return sector.getVilles().size();
	}

	
	public static int countBuildings() {
		int total = 0;
		for (Secteur sector : Jeu.world) {
			for (Ville city : sector.getVilles()) {
				total += city.getBatiments().size();
			}
		}
		return total;
	}
	
	public static int countBuildings(Secteur sector) {
		int total = 0;
		for (Ville city : sector.getVilles()) {
			total += city.getBatiments().size();
		}
		return total;
	}
	
	public static int countBuildings(Ville city) {
		return city.getBatiments().size();
	}
	
	public static int countVilains() {
		int total = 0;
		for (Secteur sector : Jeu.world) {
			for (Ville city : sector.getVilles()) {
				for (Batiment building : city.getBatiments()) {
					total += building.getMechants().size();
				}	
			}		
		}
		return total;
	}
	
	public static int countVilains(Secteur sector) {
		int total = 0;
		for (Ville city : sector.getVilles()) {
			for (Batiment building : city.getBatiments()) {
				total += building.getMechants().size();
			}		
		}
		return total;
	}
	
	public static int countVilains(Ville city) {
		int total = 0;
		for (Batiment building : city.getBatiments()) {
			total += building.getMechants().size();
		}
		return total;
	}
	
	public static int countVilains(Batiment building) {
		return building.getMechants().size();
	}
	

	public static void destroyCity(byte userChoice) {
		// TODO Auto-generated method stub
		
	}


	public static void createCity() {
		// TODO Auto-generated method stub
		
	}


	public static void destroyBuilding() {
		// TODO Auto-generated method stub
		
	}


	public static void buildBuilding() {
		// TODO Auto-generated method stub
		
	}

	public static void launchFight(Mechant vilain) {
		System.out.println("EVOLUTION -- Champs de Bataille");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		// Il faut g�n�rer un nombre al�aoire pour savoir qui d�marre le combat.
		
		while ((Jeu.player.getVie() > 0) || (vilain.getVie() > 0)) {
			
		}
		
	}


	public static void inspectCity(byte userChoice) {
		// TODO Auto-generated method stub
		
	}
	
	
}
