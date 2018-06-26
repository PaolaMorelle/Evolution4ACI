package nmetivier.com.enumerations;

/**
 * 
 * @author Nicolas.Metivier
 *
 */
public enum MenuMechantsActions {
	
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
	ATTACK(2, "Attaquer");
	
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
	MenuMechantsActions() {
		
	}
	
	/**
	 * 
	 * @param id
	 * @param value
	 */
	MenuMechantsActions(int id, String value) {
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
	public static MenuMechantsActions fromString(String text) {
		for (MenuMechantsActions menuItem : MenuMechantsActions.values()) {
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
	public static MenuMechantsActions fromID(int id) {
		for (MenuMechantsActions menuItem : MenuMechantsActions.values()) {
			if (menuItem.getID() == id) {
				return menuItem;
			}
		}
		return null;
	}
	
}
