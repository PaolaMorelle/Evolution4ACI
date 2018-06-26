package nmetivier.com;

import java.util.Iterator;

import nmetivier.com.enumerations.Ressource;
import nmetivier.com.objetcs.Batiment;
import nmetivier.com.objetcs.Menu;
import nmetivier.com.objetcs.Secteur;
import nmetivier.com.objetcs.Ville;

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
		Secteur[] secteurs = genererSecteurs();
		Menu menu = new Menu();
		menu.afficherBanniere();
		System.out.println(secteurs[2].getVilles()[1].getBatiments().get(0).getNom());
	}

	/**
	 * Fonction qui génère les secteurs.
	 * @return
	 */
	private static Secteur[] genererSecteurs() {
		byte totalSecteur = 3;
		
		Secteur[] secteurs = new Secteur[totalSecteur];
		
		secteurs[0] = new Secteur("Dead Zone");
		secteurs[0].addVille(0, new Ville("Ordan-Larroque"));
		secteurs[0].addVille(1, new Ville("Auch"));
		secteurs[0].addVille(2, new Ville("Jegun"));
		secteurs[0].addVille(3, new Ville("Toulouse"));

		secteurs[1] = new Secteur("Zone 51");
		secteurs[1].addVille(0, new Ville("Nantes"));
		secteurs[1].addVille(1, new Ville("Grenoble"));
		secteurs[1].addVille(2, new Ville("Paris"));
		secteurs[1].addVille(3, new Ville("Toulon"));

		secteurs[2] = new Secteur("Nightmare");
		secteurs[2].addVille(0, new Ville("Marseille"));
		secteurs[2].addVille(1, new Ville("Belfort"));
		secteurs[2].addVille(2, new Ville("New-York"));
		secteurs[2].addVille(3, new Ville("Sidney"));
		
		secteurs[0].getVilles()[0].addBatiment(new Batiment(Ressource.CARBURANT, "Station Avia #0", 100, (short) 5, null));
		secteurs[0].getVilles()[0].addBatiment(new Batiment(Ressource.MUNITIONS, "Armunation LOW #0", 200, (short) 10, null));
		secteurs[0].getVilles()[0].addBatiment(new Batiment(Ressource.NOURITURE, "Lidl #0", 400, (short) 50, null));
		secteurs[0].getVilles()[0].addBatiment(new Batiment(Ressource.NOURITURE, "SuboMacDo #0", 800, (short) 100, null));
		
		secteurs[0].getVilles()[1].addBatiment(new Batiment(Ressource.NOURITURE, "Lidl #1", 1000, (short) 1000, null));
		secteurs[0].getVilles()[1].addBatiment(new Batiment(Ressource.NOURITURE, "Auchanps #0", 1200, (short) 1000, null));
		secteurs[0].getVilles()[1].addBatiment(new Batiment(Ressource.MUNITIONS, "Armunation LOW #1", 1400, (short) 1500, null));
		secteurs[0].getVilles()[1].addBatiment(new Batiment(Ressource.NOURITURE, "Auchanps #1", 1800, (short) 500, null));
		secteurs[0].getVilles()[1].addBatiment(new Batiment(Ressource.NOURITURE, "Lidl #2", 2000, (short) 500, null));
		secteurs[0].getVilles()[1].addBatiment(new Batiment(Ressource.CARBURANT, "Station Esso #0", 2500, (short) 1000, null));
		
		secteurs[0].getVilles()[2].addBatiment(new Batiment(Ressource.MUNITIONS, "Armunation LOW #2", 3000, (short) 1000, null));
		secteurs[0].getVilles()[2].addBatiment(new Batiment(Ressource.MUNITIONS, "Armunation LOW #3", 3500, (short) 1000, null));
		
		secteurs[0].getVilles()[3].addBatiment(new Batiment(Ressource.CARBURANT, "Station Esso #2", 3500, (short) 1000, null));
		secteurs[0].getVilles()[3].addBatiment(new Batiment(Ressource.CARBURANT, "Station Total #0", 3750, (short) 1000, null));
		secteurs[0].getVilles()[3].addBatiment(new Batiment(Ressource.CARBURANT, "Station Avia  #1", 4000, (short) 1000, null));
		
		secteurs[1].getVilles()[0].addBatiment(new Batiment(Ressource.CARBURANT, "Station Esso #3", 4500, (short) 2000, null));
		secteurs[1].getVilles()[0].addBatiment(new Batiment(Ressource.CARBURANT, "Station Total #2", 5000, (short) 2000, null));
		secteurs[1].getVilles()[0].addBatiment(new Batiment(Ressource.CARBURANT, "Station Total #3", 5500, (short) 2000, null));
		
		secteurs[1].getVilles()[1].addBatiment(new Batiment(Ressource.CARBURANT, "Station Total #4", 10000, (short) 5000, null));
		secteurs[1].getVilles()[1].addBatiment(new Batiment(Ressource.MUNITIONS, "Armunation LOW #4", 15000, (short) 5000, null));
		secteurs[1].getVilles()[1].addBatiment(new Batiment(Ressource.CARBURANT, "Station Total #5", 20000, (short) 5000, null));
		secteurs[1].getVilles()[1].addBatiment(new Batiment(Ressource.CARBURANT, "Station Total #6", 25000, (short) 5000, null));
		
		secteurs[1].getVilles()[2].addBatiment(new Batiment(Ressource.MUNITIONS, "Armunation HEAVY #0", 40000, (short) 5000, null));
		secteurs[1].getVilles()[2].addBatiment(new Batiment(Ressource.CARBURANT, "Station Total #7", 45000, (short) 5000, null));
		
		secteurs[1].getVilles()[3].addBatiment(new Batiment(Ressource.CARBURANT, "Station Total #8", 45000, (short) 5000, null));
		
		secteurs[2].getVilles()[0].addBatiment(new Batiment(Ressource.NOURITURE, "Auchanps #2", 45000, (short) 10000, null));
		secteurs[2].getVilles()[0].addBatiment(new Batiment(Ressource.CARBURANT, "Station Esso #4", 40000, (short) 20000, null));
		
		secteurs[2].getVilles()[1].addBatiment(new Batiment(Ressource.NOURITURE, "Auchanps #3", 35000, (short) 20000, null));
		secteurs[2].getVilles()[1].addBatiment(new Batiment(Ressource.NOURITURE, "SuboMacDo #1", 30000, (short) 20000, null));
		secteurs[2].getVilles()[1].addBatiment(new Batiment(Ressource.NOURITURE, "SuboMacDo #2", 50000, (short) 20000, null));
		
		secteurs[2].getVilles()[2].addBatiment(new Batiment(Ressource.NOURITURE, "SuboMacDo #3", 100000, (short) 50000, null));
		secteurs[2].getVilles()[2].addBatiment(new Batiment(Ressource.NOURITURE, "Auchanps #4", 200000, (short) 50000, null));
		secteurs[2].getVilles()[2].addBatiment(new Batiment(Ressource.NOURITURE, "Station Avia", 300000, (short) 50000, null));
		secteurs[2].getVilles()[2].addBatiment(new Batiment(Ressource.CARBURANT, "Station Avia  #2", 400000, (short) 50000, null));
		
		secteurs[2].getVilles()[3].addBatiment(new Batiment(Ressource.CARBURANT, "Station Total #9", 500000, (short) 100000, null));
		secteurs[2].getVilles()[3].addBatiment(new Batiment(Ressource.NOURITURE, "Lidl #3", 700000, (short) 100000, null));
		secteurs[2].getVilles()[3].addBatiment(new Batiment(Ressource.MUNITIONS, "Armunation HEAVY #1", 800000, (short) 100000, null));
		secteurs[2].getVilles()[3].addBatiment(new Batiment(Ressource.CARBURANT, "Station Total #10", 900000, (short) 100000, null));
		secteurs[2].getVilles()[3].addBatiment(new Batiment(Ressource.MUNITIONS, "Armunation HEAVY #2", 999999, (short) 100000, null));
		
		return secteurs;
	}
	
}
