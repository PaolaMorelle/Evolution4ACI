package nmetivier.com.enumerations;

/**
 * 
 * @author Nicolas.Metivier
 *
 */
public enum MenuPrincipalActions {
	
	/**
	 * 
	 */
	SECTORS(1, "Secteurs"), // ID + Nom + TOTAL villes + Total batiments
	
	/**
	 * 
	 */
	CITIES(2, "Villes"), // ID, Nom, Secteur, Total de batiments.
	
	/**
	 * 
	 */
	BUILDINGS(3, "Batiments"), // ID, Nom, Ressource, Description, Total de meschants
	
	/**
	 * 
	 */
	VILAINS(4, "Méchants"),
	
	/**
	 * 
	 */
	EXIT(5, "Quitter");
	
	/**
	 * 
	 */
	private int id;
	
	/**
	 * 
	 */
	private String value;
	
	/**
	 * 
	 */
	MenuPrincipalActions() {
		
	}
	
	/**
	 * 
	 * @param id
	 * @param value
	 */
	MenuPrincipalActions(int id, String value) {
		this.id = id;
		this.value = value;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getID() {
		return this.id;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getValue() {
		return this.value;
	}
	
	/**
	 * 
	 * @param text
	 * @return
	 */
	public static MenuPrincipalActions fromString(String text) {
		for (MenuPrincipalActions menuItem : MenuPrincipalActions.values()) {
			if (menuItem.value.equalsIgnoreCase(text)) {
				return menuItem;
			}
		}
		return null;
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public static MenuPrincipalActions fromID(int id) {
		for (MenuPrincipalActions menuItem : MenuPrincipalActions.values()) {
			if (menuItem.getID() == id) {
				return menuItem;
			}
		}
		return null;
	}
	
}
