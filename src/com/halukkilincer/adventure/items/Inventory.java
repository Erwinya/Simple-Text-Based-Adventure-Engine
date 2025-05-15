package com.halukkilincer.adventure.items;


public class Inventory  {

	private boolean dungeonKey;
	private int potionHP, damage, armour, charBodyArmour,charWeapon;

	public Inventory() {

		this.dungeonKey = false;
		this.charBodyArmour = 0;
		this.charWeapon = 0;
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


	public int isCharBodyArmour() {
		return charBodyArmour;
	}

	public void setCharBodyArmour(int charBodyArmour) {
		this.charBodyArmour = charBodyArmour;
	}

	
	public int isCharWeapon() {
		return charWeapon;
	}

	public void setCharWeapon(int charWeapon) {
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

	public int getCharBodyArmour() {
		return charBodyArmour;
	}

	public int getCharWeapon() {
		return charWeapon;
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
