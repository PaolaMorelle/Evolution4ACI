package nmetivier.com.enumerations;

/**
 * 
 * @author Nicolas.Metivier
 *
 */
public enum MenuSecteursActions {
	
	/**
	 * 
	 */
	SHOW(1, "Lister"), // ID + Nom + TOTAL villes + Total batiments
	
	/**
	 * 
	 */
	BACK(0, "Retour");
	
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
	MenuSecteursActions() {
		
	}
	
	/**
	 * 
	 * @param id
	 * @param value
	 */
	MenuSecteursActions(int id, String value) {
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
	public static MenuSecteursActions fromString(String text) {
		for (MenuSecteursActions menuItem : MenuSecteursActions.values()) {
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
	public static MenuSecteursActions fromID(int id) {
		for (MenuSecteursActions menuItem : MenuSecteursActions.values()) {
			if (menuItem.getID() == id) {
				return menuItem;
			}
		}
		return null;
	}
	
}
