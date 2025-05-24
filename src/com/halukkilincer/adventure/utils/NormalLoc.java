package com.halukkilincer.adventure.utils;

import com.halukkilincer.adventure.characters.Player;

public abstract class NormalLoc extends Location {

	public NormalLoc(Player player, String name) {
		super(player);
		this.setName(name);
	}

	public boolean getLocation() throws InterruptedException {
		return true;
	}

}
