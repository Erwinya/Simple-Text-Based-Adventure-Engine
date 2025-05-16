package com.halukkilincer.adventure.characters;

import com.halukkilincer.adventure.items.Inventory;

public class Player {

	private int damage, health, defense, firstHealth;
	private String name, charName;
	private Inventory inventory = new Inventory();
	private int initialMoney = 750;
	private int Money = initialMoney;
	public void initializeCharacter() throws InterruptedException {
		switch (this.getCharName()) {

		case "savaşçı" -> {

			setStats(3100, 1500, 750);
			System.out.println(this.charName + " baltasını sıkıca kavradı. Gücü, sadece kaslarında değil, "
					+ "yüreğindeki sarsılmaz inançtaydı." + "\n\tAttack :   " + this.damage + "\n\tHP      :  "
					+ this.health + "\n\tDefance :  " + this.defense);
		}
		case "suikastçı" -> {
			setStats(4200, 1200, 450);
			System.out.println(this.charName + " sessizliği bir silah gibi kullanıyordu. "
					+ "Bir anlık tereddüt bile düşmanına ölüm getirebilirdi." + "\n\tAttack :   " + this.damage
					+ "\n\tHP      :  " + this.health + "\n\tDefance :  " + this.defense);
		}
		case "büyücü" -> {
			setStats(5500, 800, 250);
			System.out.println(this.charName + " kadim rünleri fısıldayarak ellerinde alevler dans ettiriyordu. "
					+ "Gökyüzünü yaracak bir güçle, savaşın kaderini değiştirebilirdi." + "\n\tAttack :   "
					+ this.damage + "\n\tHP      :  " + this.health + "\n\tDefance :  " + this.defense);
		}
		case "şifacı" -> {
			setStats(2300, 1700, 850);
			System.out.println(this.charName + " müttefiklerinin son umudu olmuştu. "
					+ "Şifalı büyüleriyle yaraları sarıyor, lanetleri yok ediyordu." + "\n\tAttack :   " + this.damage
					+ "\n\tHP      :  " + this.health + "\n\tDefance :  " + this.defense);
		}
		default -> System.out.println("Geçersiz karakter seçimi!");

		}
		Thread.sleep(3000);
	}
	public int getTotalDamage() {
		setDamage(getDamage()+getInventory().getCharWeapon());
		return damage;
		 
	}public int getTotalDefense() {
		setDefense(getDefense()+getInventory().getCharBodyArmour());
		
		return defense;
		
		
	}
	private void setStats(int damage, int health, int defense) {
		this.damage = damage;
		this.health = health;
		this.defense = defense;
		this.firstHealth = health;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCharName() {
		return charName;
	}

	public void setCharName(String selectCharInput) {
		this.charName = selectCharInput;
	}

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

	public int getFirstHealth() {
		return firstHealth;
	}

	public void setFirstHealth(int firstHealth) {
		this.firstHealth = firstHealth;
	}

	public int getMoneyStart() {
		return initialMoney;
	}

	public void setMoneyStart(int moneyStart) {
		this.initialMoney = moneyStart;
	}

	public int getMoney() {
		return Money;
	}

	public void setMoney(int money) {
		Money = money;
	}

}
