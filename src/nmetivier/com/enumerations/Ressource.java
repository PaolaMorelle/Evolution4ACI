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
	

	/**
	 * 
	 * @param text
	 * @return
	 */
	/*public static MenuSecteursActions fromString(String text) {
		for (MenuSecteursActions menuItem : MenuSecteursActions.values()) {
			if (menuItem.value.equalsIgnoreCase(text)) {
				return menuItem;
			}
		}
		return null;
	}*/
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	/*public static MenuSecteursActions fromID(int id) {
		for (MenuSecteursActions menuItem : MenuSecteursActions.values()) {
			if (menuItem.getID() == id) {
				return menuItem;
			}
		}
		return null;
	}*/
}
