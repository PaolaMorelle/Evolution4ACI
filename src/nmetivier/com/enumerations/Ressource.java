package nmetivier.com.enumerations;

public enum Ressource {
	NOURITURE(1,	"NOURITURE"),
	CARBURANT(2,	"CARBURANT"),
	MUNITIONS(3,	"MUNITIONS");
	
	private int id;
	private String nom;
	
	Ressource() {
		
	}
	
	Ressource(int id, String nom) {
		this.id = id;
		this.nom = nom;
	}
}
