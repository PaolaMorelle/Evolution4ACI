package nmetivier.com.enumerations;

public enum MenuActions {
	SECTORS("Secteur"),
	SECTORS_SHOW("Secteur"), // ID + Nom + TOTAL villes + Total batiments
	SECTORS_SELECT("Secteur"),
	
	CITIES("Secteur"), // ID, Nom, Secteur, Total de batiments.
	CITIES_SHOW("Secteur"),
	CITIES_CREATE("Secteur"),
	CITIES_MODIFY("Secteur"),
	CITIES_DESTROY("Secteur"),
	CITIES_SELECT("Secteur"),
	
	BUILDINGS("Secteur"), // ID, Nom, Ressource, Description, Total de meschants
	BUILDINGS_SHOW("Secteur"),
	BUILDINGS_CREATE("Secteur"),
	BUILDINGS_MODIFY("Secteur"),
	BUILDINGS_DESTROY("Secteur"),
	BUILDINGS_SELECT("Secteur"),
	
	VILAINS("Secteur"),
	VILAINS_SHOW("Secteur"),
	VILAINS_ATTACK("Secteur"),
	VILAINS_SELECT(""),
	
	EXIT("Secteur");
	
	private int id;
	private String value;
	
	MenuActions() {
		
	}
	
	MenuActions(String value) {
		this.value = value;
	}
	
	MenuActions(int id, String value) {
		this.id = id;
		this.value = value;
	}
	
}
