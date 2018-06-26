package nmetivier.com.objetcs;

import nmetivier.com.enumerations.Ressource;

public class Engine {

	/**
	 * Fonction qui génère les secteurs.
	 * @return
	 */
	static Secteur[] createWorld() {
		byte totalSecteur = 3;
		
		Secteur[] secteurs = new Secteur[totalSecteur];
		
		secteurs[0] = new Secteur("Azeroth");
		secteurs[0].addVille(0, new Ville("L'Exodar"));
		secteurs[0].getVilles()[0].addBatiment(new Batiment(Ressource.CARBURANT, "Station Avia #0", 100, (short) 5, null));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Korialstrasz", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Tyranastrasz", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Caelestrasz", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Vaelastrasz", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Keristrasza", (short) 10));
		
		secteurs[0].getVilles()[0].addBatiment(new Batiment(Ressource.MUNITIONS, "Armunation LOW #0", 200, (short) 10, null));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Malygos", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Kalecgos", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Sindragosa", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Saphiron", (short) 10));
		
		secteurs[0].getVilles()[0].addBatiment(new Batiment(Ressource.NOURITURE, "Lidl #0", 400, (short) 50, null));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Nozdormu", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Anachronos", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Chronormu", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Soridormi", (short) 10));
		
		secteurs[0].getVilles()[0].addBatiment(new Batiment(Ressource.NOURITURE, "SuboMacDo #0", 800, (short) 100, null));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Ysera", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Eranikus", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Valithria Marcherêve", (short) 10));
		
		
		secteurs[0].addVille(1, new Ville("Orgrimar"));
		secteurs[0].getVilles()[1].addBatiment(new Batiment(Ressource.NOURITURE, "Lidl #1", 1000, (short) 1000, null));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Neltharion", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Onyxia", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Néfarian", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Sinestra", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Irion", (short) 10));
		
		secteurs[0].getVilles()[1].addBatiment(new Batiment(Ressource.NOURITURE, "Auchanps #0", 1200, (short) 1000, null));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Murozond", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Deathwing", (short) 10));
		
		secteurs[0].getVilles()[1].addBatiment(new Batiment(Ressource.MUNITIONS, "Armunation LOW #1", 1400, (short) 1500, null));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		
		secteurs[0].getVilles()[1].addBatiment(new Batiment(Ressource.NOURITURE, "Auchanps #1", 1800, (short) 500, null));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		
		secteurs[0].getVilles()[1].addBatiment(new Batiment(Ressource.NOURITURE, "Lidl #2", 2000, (short) 500, null));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		
		secteurs[0].getVilles()[1].addBatiment(new Batiment(Ressource.CARBURANT, "Station Esso #0", 2500, (short) 1000, null));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		
		
		secteurs[0].addVille(2, new Ville("Forgefer"));
		secteurs[0].getVilles()[2].addBatiment(new Batiment(Ressource.MUNITIONS, "Armunation LOW #2", 3000, (short) 1000, null));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		
		secteurs[0].getVilles()[2].addBatiment(new Batiment(Ressource.MUNITIONS, "Armunation LOW #3", 3500, (short) 1000, null));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		
		
		secteurs[0].addVille(3, new Ville("Lune d'Argent"));
		secteurs[0].getVilles()[3].addBatiment(new Batiment(Ressource.CARBURANT, "Station Esso #2", 3500, (short) 1000, null));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		
		secteurs[0].getVilles()[3].addBatiment(new Batiment(Ressource.CARBURANT, "Station Total #0", 3750, (short) 1000, null));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		
		secteurs[0].getVilles()[3].addBatiment(new Batiment(Ressource.CARBURANT, "Station Avia  #1", 4000, (short) 1000, null));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		
		
		secteurs[1] = new Secteur("Outreterre");
		secteurs[1].addVille(0, new Ville("Hurlevent"));
		secteurs[1].getVilles()[0].addBatiment(new Batiment(Ressource.CARBURANT, "Station Esso #3", 4500, (short) 2000, null));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		
		secteurs[1].getVilles()[0].addBatiment(new Batiment(Ressource.CARBURANT, "Station Total #2", 5000, (short) 2000, null));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		
		secteurs[1].getVilles()[0].addBatiment(new Batiment(Ressource.CARBURANT, "Station Total #3", 5500, (short) 2000, null));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		
		
		secteurs[1].addVille(1, new Ville("Fosoyyeuse"));
		secteurs[1].getVilles()[1].addBatiment(new Batiment(Ressource.CARBURANT, "Station Total #4", 10000, (short) 5000, null));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		
		secteurs[1].getVilles()[1].addBatiment(new Batiment(Ressource.MUNITIONS, "Armunation LOW #4", 15000, (short) 5000, null));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		
		secteurs[1].getVilles()[1].addBatiment(new Batiment(Ressource.CARBURANT, "Station Total #5", 20000, (short) 5000, null));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		
		secteurs[1].getVilles()[1].addBatiment(new Batiment(Ressource.CARBURANT, "Station Total #6", 25000, (short) 5000, null));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		
		
		secteurs[1].addVille(2, new Ville("Les Pitons du Tonnerres"));
		secteurs[1].getVilles()[2].addBatiment(new Batiment(Ressource.MUNITIONS, "Armunation HEAVY #0", 40000, (short) 5000, null));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		
		secteurs[1].getVilles()[2].addBatiment(new Batiment(Ressource.CARBURANT, "Station Total #7", 45000, (short) 5000, null));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		
		
		secteurs[1].addVille(3, new Ville("Shattrath"));
		secteurs[1].getVilles()[3].addBatiment(new Batiment(Ressource.CARBURANT, "Station Total #8", 45000, (short) 5000, null));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		

		
		secteurs[2] = new Secteur("Nightmare");
		secteurs[2].addVille(0, new Ville("Dalaran"));
		secteurs[2].getVilles()[0].addBatiment(new Batiment(Ressource.NOURITURE, "Auchanps #2", 45000, (short) 10000, null));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		
		secteurs[2].getVilles()[0].addBatiment(new Batiment(Ressource.CARBURANT, "Station Esso #4", 40000, (short) 20000, null));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		
		
		secteurs[2].addVille(1, new Ville("Darnasus"));
		secteurs[2].getVilles()[1].addBatiment(new Batiment(Ressource.NOURITURE, "Auchanps #3", 35000, (short) 20000, null));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		
		secteurs[2].getVilles()[1].addBatiment(new Batiment(Ressource.NOURITURE, "SuboMacDo #1", 30000, (short) 20000, null));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		
		secteurs[2].getVilles()[1].addBatiment(new Batiment(Ressource.NOURITURE, "SuboMacDo #2", 50000, (short) 20000, null));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		
		
		secteurs[2].addVille(2, new Ville("Fer de Lance"));
		secteurs[2].getVilles()[2].addBatiment(new Batiment(Ressource.NOURITURE, "SuboMacDo #3", 100000, (short) 50000, null));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		
		secteurs[2].getVilles()[2].addBatiment(new Batiment(Ressource.NOURITURE, "Auchanps #4", 200000, (short) 50000, null));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		
		secteurs[2].getVilles()[2].addBatiment(new Batiment(Ressource.NOURITURE, "Station Avia", 300000, (short) 50000, null));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		
		secteurs[2].getVilles()[2].addBatiment(new Batiment(Ressource.CARBURANT, "Station Avia  #2", 400000, (short) 50000, null));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		
		
		secteurs[2].addVille(3, new Ville("Le Maelstrom"));
		secteurs[2].getVilles()[3].addBatiment(new Batiment(Ressource.CARBURANT, "Station Total #9", 500000, (short) 100000, null));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		
		secteurs[2].getVilles()[3].addBatiment(new Batiment(Ressource.NOURITURE, "Lidl #3", 700000, (short) 100000, null));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		
		secteurs[2].getVilles()[3].addBatiment(new Batiment(Ressource.MUNITIONS, "Armunation HEAVY #1", 800000, (short) 100000, null));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		
		secteurs[2].getVilles()[3].addBatiment(new Batiment(Ressource.CARBURANT, "Station Total #10", 900000, (short) 100000, null));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		
		secteurs[2].getVilles()[3].addBatiment(new Batiment(Ressource.MUNITIONS, "Armunation HEAVY #2", 999999, (short) 100000, null));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		secteurs[0].getVilles()[0].getBatiments().get(0).addMechant(new Mechant("Alexstrasza", (short) 10));
		

		
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
	
	
	public static void showBuildings() {
		for (Secteur sector : Jeu.world) {
			for (Ville city : sector.getVilles()) {
				for (Batiment building : city.getBatiments()) {
					System.out.println(
							String.format(
									"[%S] - %S \t (Secteur de %S) \t (Ville de %S) \t Génère %S \t %S mechant(s)",
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
								"[%S] - %S \t (Ville de %S) \t Génère %S \t %S mechant(s)",
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
							"[%S] - %S \t Génère %S \t %S mechant(s)",
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
					System.out.println(
							String.format(
									"[%S] - %S \t (Ville de %S) \t (Secteur de %S)",
									building.getID(),
									building.getNom(),
									city.getNom(),
									sector.getNom()
								)
							);
				}
			}
		}
	}

	public static void showVilains(Secteur sector) {
		for (Ville city : sector.getVilles()) {
			for (Batiment building : city.getBatiments()) {
				System.out.println(
						String.format(
								"[%S] - %S \t (Ville de %S)",
								building.getID(),
								building.getNom(),
								city.getNom()
							)
						);
			}
		}
	}
	
	public static void showVilains(Ville city) {
		for (Batiment building : city.getBatiments()) {
			int totalVilains = 0;
			System.out.println(
					String.format(
							"[%S] - %S",
							building.getID(),
							building.getNom()
						)
					);
		}
	}
	
	public static void showVilains(Batiment building) {
		int totalVilains = 0;
		System.out.println(
				String.format(
						"[%S] - %S",
						building.getID(),
						building.getNom()
					)
				);
	}
	
	
	public static int countCities() {
		int total = 0;
		for (Secteur sector : Jeu.world) {
			total += sector.getVilles().length;
		}
		return total;
	}
	
	public static int countCities(Secteur sector) {
		return sector.getVilles().length;
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
	
	private static int countBuildings(Ville city) {
		return city.getBatiments().size();
	}
	
	
	private static int countVilains() {
		int total = 0;
		for (Secteur sector : Jeu.world) {
			for (Ville city : sector.getVilles()) {
				for (Batiment building : city.getBatiments()) {
					total += building.getMechants().length;
				}	
			}		
		}
		return total;
	}
	
	private static int countVilains(Secteur sector) {
		int total = 0;
		for (Ville city : sector.getVilles()) {
			for (Batiment building : city.getBatiments()) {
				total += building.getMechants().length;
			}		
		}
		return total;
	}
	
	private static int countVilains(Ville city) {
		int total = 0;
		for (Batiment building : city.getBatiments()) {
			total += building.getMechants().length;
		}
		return total;
	}
	
	private static int countVilains(Batiment building) {
		return building.getMechants().length;
	}


	public static void destroyCity() {
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
	
	
}
