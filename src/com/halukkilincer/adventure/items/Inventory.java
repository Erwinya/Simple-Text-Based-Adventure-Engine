package com.halukkilincer.adventure.items;


public class Inventory  {

	private boolean dungeonKey, charBodyArmour,charWeapon;
	private int potionHP, damage, armour;

	public Inventory() {

		this.dungeonKey = false;
		this.charBodyArmour = false;
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


	public boolean isCharBodyArmour() {
		return charBodyArmour;
	}

	public void setCharBodyArmour(boolean charBodyArmour) {
		this.charBodyArmour = charBodyArmour;
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
