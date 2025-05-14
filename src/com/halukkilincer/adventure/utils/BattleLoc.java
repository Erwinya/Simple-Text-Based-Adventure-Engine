package com.halukkilincer.adventure.utils;

import com.halukkilincer.adventure.characters.Player;

public abstract class BattleLoc extends Location {
	Obstacle obstacle;

	public BattleLoc(Player player, String name, Obstacle obstacle) {
		super(player);
		this.obstacle = obstacle;
		player.setName(name);
	}

	public boolean getLocation() {

		return true;

	}
}
