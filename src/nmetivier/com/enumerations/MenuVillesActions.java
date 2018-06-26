package nmetivier.com.enumerations;

/**
 * 
 * @author Nicolas.Metivier
 *
 */
public enum MenuVillesActions {
	
	/**
	 * 
	 */
	SHOW(1, "Lister"), // ID + Nom + TOTAL villes + Total batiments
	
	/**
	 * 
	 */
	BACK(0, "Retour"),
	
	/**
	 * 
	 */
	DETAILS(2, "Afficher"),
	
	/**
	 * 
	 */
	CREATE(3,"Créer"),
	
	/**
	 * 
	 */
	DESTROY(4,"Détruire");
	
	
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
	MenuVillesActions() {
		
	}
	
	/**
	 * 
	 * @param id
	 * @param value
	 */
	MenuVillesActions(int id, String value) {
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
	public static MenuVillesActions fromString(String text) {
		for (MenuVillesActions menuItem : MenuVillesActions.values()) {
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
	public static MenuVillesActions fromID(int id) {
		for (MenuVillesActions menuItem : MenuVillesActions.values()) {
			if (menuItem.getID() == id) {
				return menuItem;
			}
		}
		return null;
	}
	
}
