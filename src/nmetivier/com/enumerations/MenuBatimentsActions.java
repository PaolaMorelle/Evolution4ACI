package nmetivier.com.enumerations;

/**
 * 
 * @author Nicolas.Metivier
 *
 */
public enum MenuBatimentsActions {
	
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
	MenuBatimentsActions() {
		
	}
	
	/**
	 * 
	 * @param id
	 * @param value
	 */
	MenuBatimentsActions(int id, String value) {
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
	public static MenuBatimentsActions fromString(String text) {
		for (MenuBatimentsActions menuItem : MenuBatimentsActions.values()) {
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
	public static MenuBatimentsActions fromID(int id) {
		for (MenuBatimentsActions menuItem : MenuBatimentsActions.values()) {
			if (menuItem.getID() == id) {
				return menuItem;
			}
		}
		return null;
	}
	
}
