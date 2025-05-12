
public class Inventory extends Player {

	private boolean dungeonKey,charHelmet,charBodyArmour,
	charPantsArmour,charBootsArmour,charGlovesArmour,charWeapon;
	private int potionHP,damage,armour;
	
	public Inventory() {
		
		this.dungeonKey = false;
		this.charHelmet = false;
		this.charBodyArmour = false;
		this.charPantsArmour = false;
		this.charBootsArmour = false;
		this.charGlovesArmour = false;
		this.charWeapon = false;
		this.potionHP = 0;
		this.damage = 0;
		this.armour = 0;
	}

	public boolean isDungeonKey() {
		return dungeonKey;
	}

	public void setDungeonKey(boolean dungeonKey) {
		this.dungeonKey = dungeonKey;
	}

	public boolean isCharHelmet() {
		return charHelmet;
	}

	public void setCharHelmet(boolean charHelmet) {
		this.charHelmet = charHelmet;
	}

	public boolean isCharBodyArmour() {
		return charBodyArmour;
	}

	public void setCharBodyArmour(boolean charBodyArmour) {
		this.charBodyArmour = charBodyArmour;
	}

	public boolean isCharPantsArmour() {
		return charPantsArmour;
	}

	public void setCharPantsArmour(boolean charPantsArmour) {
		this.charPantsArmour = charPantsArmour;
	}

	public boolean isCharBootsArmour() {
		return charBootsArmour;
	}

	public void setCharBootsArmour(boolean charBootsArmour) {
		this.charBootsArmour = charBootsArmour;
	}

	public boolean isCharGlovesArmour() {
		return charGlovesArmour;
	}

	public void setCharGlovesArmour(boolean charGlovesArmour) {
		this.charGlovesArmour = charGlovesArmour;
	}

	public boolean isCharWeapon() {
		return charWeapon;
	}

	public void setCharWeapon(boolean charWeapon) {
		this.charWeapon = charWeapon;
	}

	public int getPotionHP() {
		return potionHP;
	}

	public void setPotionHP(int potionHP) {
		this.potionHP = potionHP;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getArmour() {
		return armour;
	}

	public void setArmour(int armour) {
		this.armour = armour;
	}
	
	
}
